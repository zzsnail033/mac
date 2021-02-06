package com.nykj.dataconversion.util;

import com.nykj.dataconversion.codeEnum.ResultEnum;
import com.nykj.dataconversion.exception.HospitalException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@Component
public class AESUtil {

	//使用AES-128-CBC加密模式，key需要为16位,key和iv可以相同，也可以不同!
	public static String KEY;
	public static String IV;

	private static final String CIPHER_ALGORITHM_CBC = "AES/CBC/NoPadding";

	/**
	 * 因为静态变量不能直接从配置文件通过@value获取，所以采用此方法
	 *
	 * @param key
	 */
	@Value("${AES.KEY}")
	public void AESkey(String key) {
		KEY = key;
	}

	@Value("${AES.IV}")
	public void AESIv(String iv) {
		IV = iv;
	}

	/**
	 * 加密方法 返回base64加密字符串
	 * 和前端保持一致
	 *
	 * @param data 要加密的数据
	 * @param key  加密key
	 * @param iv   加密iv
	 * @return 加密的结果
	 * @throws Exception
	 */
	public static String encrypt(String data, String key, String iv) {
		try {
			Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM_CBC);//"算法/模式/补码方式"NoPadding PKCS5Padding
			int blockSize = cipher.getBlockSize();

			byte[] dataBytes = data.getBytes();
			int plaintextLength = dataBytes.length;
			if (plaintextLength % blockSize != 0) {
				plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
			}
			byte[] plaintext = new byte[plaintextLength];
			System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);

			SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
			IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());

			cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);
			byte[] encrypted = cipher.doFinal(plaintext);
			return parseByte2HexStr(encrypted);
//			return new Base64().encodeToString(encrypted);
		} catch (Exception e) {
			e.printStackTrace();
			throw new HospitalException(ResultEnum.PARAMS_IS_VALID);
		}
	}

	/**
	 * 解密方法
	 *
	 * @param data 要解密的数据
	 * @param key  解密key
	 * @param iv   解密iv
	 * @return 解密的结果
	 * @throws Exception
	 */
	public static String decrypt(String data, String key, String iv) {
		try {
			Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM_CBC);
			SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
			IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());
			cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);
//			byte[] original = cipher.doFinal(new Base64().decode(data));
			byte[] original = cipher.doFinal(parseHexStr2Byte(data));
			String originalString = new String(original);
			return originalString;
		} catch (Exception e) {
			e.printStackTrace();
			throw new HospitalException(ResultEnum.PARAMS_IS_VALID);
		}
	}

	/**将二进制转换成16进制
	 * @param buf
	 * @return
	 */
	public static String parseByte2HexStr(byte buf[]) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < buf.length; i++) {
			String hex = Integer.toHexString(buf[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			sb.append(hex.toUpperCase());
		}
		return sb.toString();
	}

	/**将16进制转换为二进制
	 * @param hexStr
	 * @return
	 */
	public static byte[] parseHexStr2Byte(String hexStr) {
		if (hexStr.length() < 1)
			return null;
		byte[] result = new byte[hexStr.length()/2];
		for (int i = 0;i< hexStr.length()/2; i++) {
			int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);
			int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);
			result[i] = (byte) (high * 16 + low);
		}
		return result;
	}



	/**
	 * 测试
	 */
	@SuppressWarnings({"unchecked", "rawtypes"})
	public static void main(String args[]) throws Exception {
		String abc = "{\"parmas\":{\"name\":\"张三\",\"age\":23},\"code\":200}";
		String str = encrypt(abc, "KEYvKEYvKEYvK123", "IVavIVavIVavIVav");
		String str1 = decrypt(str, "KEYvKEYvKEYvK123", "IVavIVavIVavIVav");
		System.out.println(str);
		System.out.println(str1);

		String json = "{\"json\":{\"dataFrom\":\"nykj\",\"docName\":\"李四\",\"idCard\":\"12345678911991\",\"orgCode\":\"0001\",\"orgName\":\"骨糖医院\",\"punishReason\":\"没受过处罚\",\"punishResult\":\"无结果\",\"punishTime\":1606752000000},\"code\":200}";
		String res = encrypt(json, "bbDJS2k9DfwLZO3z", "412ADFSSFQ372772");
		System.out.println(res);
	}
}