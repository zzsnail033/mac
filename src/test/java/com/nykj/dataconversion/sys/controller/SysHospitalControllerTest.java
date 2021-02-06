package com.nykj.dataconversion.sys.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.toolkit.AES;
import com.nykj.dataconversion.DataConversionApplication;
import com.nykj.dataconversion.sys.entity.*;
import com.nykj.dataconversion.util.AESUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import java.net.URL;
import java.util.Set;

/**
 * @author zhangchao
 * @version 1.0
 * @date 2021/1/5 2:21 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataConversionApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SysHospitalControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@LocalServerPort
	private int port;

	private URL base;

	@Before
	public void init() throws Exception{
		System.out.println("开始测试-----------------");
		String url = String.format("http://localhost:%d/", port);
		System.out.println(String.format("port is : [%d]", port));
		this.base = new URL(url);
	}

	@After
	public void after() {
		System.out.println("测试结束-----------------");
	}

	// 添加医生信息
	@Ignore
	@Test
	public void addDoctorBasicInfo() throws Exception {
		String selectUrl = this.base.toString() + "data-conversion/api/select/doctor-basic-info/select";
		DoctorBasicInfo result = testRestTemplate.postForObject(selectUrl, null, DoctorBasicInfo.class);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("json", result);
		jsonObject.put("code", 200);
		String params = AESUtil.encrypt(jsonObject.toJSONString(), AESUtil.KEY, AESUtil.IV);

		// 将查出来的值插入数据库
		String insertUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/sys/doctor-basic-info/addDoctorBasicInfo?params="+params;
		System.out.println(testRestTemplate.postForObject(insertUrl, null, DoctorBasicInfo.class));
	}

	@Ignore
	@Test
	public void addDoctorCreditInfo() throws Exception {
		String selectUrl = this.base.toString() + "data-conversion/api/select/doctor-credit-info/select";
		DoctorCreditInfo result = testRestTemplate.postForObject(selectUrl, null, DoctorCreditInfo.class);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("json", result);
		jsonObject.put("code", 200);
		System.out.println(jsonObject.toJSONString());
		String encryptParams = new String(AESUtil.encrypt(jsonObject.toJSONString(), AESUtil.KEY, AESUtil.IV));

		String dencryptParams = AESUtil.decrypt(encryptParams, AESUtil.KEY, AESUtil.IV);

		// 将查出来的值插入数据库
		String insertUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/sys/doctor-credit-info/addDoctorCreditInfo?params="+encryptParams;
		System.out.println(testRestTemplate.postForObject(insertUrl, null, DoctorCreditInfo.class));
	}

	@Ignore
	@Test
	public void addDrugDeliverySupersive() throws Exception {
		String selectUrl = this.base.toString() + "data-conversion/api/select/drug-delivery-supersive/select";
		DrugDeliverySupersive result = testRestTemplate.postForObject(selectUrl, null, DrugDeliverySupersive.class);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("json", result);
		jsonObject.put("code", 200);
		System.out.println(jsonObject.toJSONString());
		String encryptParams = new String(AESUtil.encrypt(jsonObject.toJSONString(), AESUtil.KEY, AESUtil.IV));

		String dencryptParams = AESUtil.decrypt(encryptParams, AESUtil.KEY, AESUtil.IV);

		// 将查出来的值插入数据库
		String insertUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/sys/drug-delivery-supersive/addDrugDeliverySupersive?params="+encryptParams;
		System.out.println(testRestTemplate.postForObject(insertUrl, null, DrugDeliverySupersive.class));
	}


	@Ignore
	@Test
	public void addLoginSupersiveInfo() throws Exception {
		String selectUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/select/login-supersive-info/select";
		LoginSupersiveInfo result = testRestTemplate.postForObject(selectUrl, null, LoginSupersiveInfo.class);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("json", result);
		jsonObject.put("code", 200);
		System.out.println(jsonObject.toJSONString());
		String encryptParams = new String(AESUtil.encrypt(jsonObject.toJSONString(), AESUtil.KEY, AESUtil.IV));

		String dencryptParams = AESUtil.decrypt(encryptParams, AESUtil.KEY, AESUtil.IV);

		// 将查出来的值插入数据库
		String insertUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/sys/login-supersive-info/addDrugDeliverySupersive?params="+encryptParams;
		System.out.println(testRestTemplate.postForObject(insertUrl, null, LoginSupersiveInfo.class));
	}

	@Ignore
	@Test
	public void addPrescription() throws Exception {
		String selectUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/select/prescription/select";
		Prescription result = testRestTemplate.postForObject(selectUrl, null, Prescription.class);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("json", result);
		jsonObject.put("code", 200);
		System.out.println(jsonObject.toJSONString());
		String encryptParams = new String(AESUtil.encrypt(jsonObject.toJSONString(), AESUtil.KEY, AESUtil.IV));

		String dencryptParams = AESUtil.decrypt(encryptParams, AESUtil.KEY, AESUtil.IV);

		// 将查出来的值插入数据库
		String insertUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/sys/login-supersive-info/addDrugDeliverySupersive?params="+encryptParams;
		System.out.println(testRestTemplate.postForObject(insertUrl, null, LoginSupersiveInfo.class));
	}

	@Ignore
	@Test
	public void addPrescriptionDrug() throws Exception {
		String selectUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/select/prescriptionDrug-drug/select";
		PrescriptionDrug result = testRestTemplate.postForObject(selectUrl, null, PrescriptionDrug.class);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("json", result);
		jsonObject.put("code", 200);
		System.out.println(jsonObject.toJSONString());
		String encryptParams = new String(AESUtil.encrypt(jsonObject.toJSONString(), AESUtil.KEY, AESUtil.IV));

		String dencryptParams = AESUtil.decrypt(encryptParams, AESUtil.KEY, AESUtil.IV);

		// 将查出来的值插入数据库
		String insertUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/sys/prescriptionDrug-drug/addPrescriptionDrug?params="+encryptParams;
		System.out.println(testRestTemplate.postForObject(insertUrl, null, PrescriptionDrug.class));
	}

//	@Ignore
	@Test
	public void addWebEmrSuperviseInfo() throws Exception {
		String selectUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/select/web-emr-supervise-info/select";
		WebEmrSuperviseInfo result = testRestTemplate.postForObject(selectUrl, null, WebEmrSuperviseInfo.class);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("json", result);
		jsonObject.put("code", 200);
		System.out.println(jsonObject.toJSONString());
		String encryptParams = new String(AESUtil.encrypt(jsonObject.toJSONString(), AESUtil.KEY, AESUtil.IV));

		String dencryptParams = AESUtil.decrypt(encryptParams, AESUtil.KEY, AESUtil.IV);

		// 将查出来的值插入数据库
		String insertUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/sys/web-emr-supervise-info/addWebEmrSuperviseInfo?params="+encryptParams;
		System.out.println(testRestTemplate.postForObject(insertUrl, null, WebEmrSuperviseInfo.class));
	}

	//	@Ignore
	@Test
	public void addSignHospitalBasicInfo() throws Exception {
		String selectUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/select/sign-hospital-basic-info/select";
		SignHospitalBasicInfo result = testRestTemplate.postForObject(selectUrl, null, SignHospitalBasicInfo.class);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("json", result);
		jsonObject.put("code", 200);
		System.out.println(jsonObject.toJSONString());
		String encryptParams = new String(AESUtil.encrypt(jsonObject.toJSONString(), AESUtil.KEY, AESUtil.IV));

		String dencryptParams = AESUtil.decrypt(encryptParams, AESUtil.KEY, AESUtil.IV);

		// 将查出来的值插入数据库
		String insertUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/sys/sign-hospital-basic-info/addSignHospitalBasicInfo?params="+encryptParams;
		System.out.println(testRestTemplate.postForObject(insertUrl, null, SignHospitalBasicInfo.class));
	}

	@Ignore
	@Test
	public void addWebHospitalBasicInfo() throws Exception {
		String selectUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/select/web-hospital-basic-info/select";
		WebHospitalBasicInfo result = testRestTemplate.postForObject(selectUrl, null, WebHospitalBasicInfo.class);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("json", result);
		jsonObject.put("code", 200);
		System.out.println(jsonObject.toJSONString());
		String encryptParams = new String(AESUtil.encrypt(jsonObject.toJSONString(), AESUtil.KEY, AESUtil.IV));

		String dencryptParams = AESUtil.decrypt(encryptParams, AESUtil.KEY, AESUtil.IV);

		// 将查出来的值插入数据库
		String insertUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/sys/sign-hospital-basic-info/addSignHospitalBasicInfo?params="+encryptParams;
		System.out.println(testRestTemplate.postForObject(insertUrl, null, SignHospitalBasicInfo.class));
	}

	@Test
	public void addWebTherapySuperviseInfo() throws Exception {
		String selectUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/select/web-therapy-supervise-info/select";
		WebTherapySuperviseInfo result = testRestTemplate.postForObject(selectUrl, null, WebTherapySuperviseInfo.class);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("json", result);
		jsonObject.put("code", 200);
		System.out.println(jsonObject.toJSONString());
		String encryptParams = new String(AESUtil.encrypt(jsonObject.toJSONString(), AESUtil.KEY, AESUtil.IV));

		String dencryptParams = AESUtil.decrypt(encryptParams, AESUtil.KEY, AESUtil.IV);

		// 将查出来的值插入数据库
		String insertUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/sys/web-therapy-supervise-info/addWebTherapySuperviseInfo?params="+encryptParams;
		System.out.println(testRestTemplate.postForObject(insertUrl, null, WebTherapySuperviseInfo.class));
	}


	@Test
	public void addWebHospitalEqpInfo() throws Exception {
		String selectUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/select/web-hospital-eqp-info/select";
		WebHospitalEqpInfo result = testRestTemplate.postForObject(selectUrl, null, WebHospitalEqpInfo.class);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("json", result);
		jsonObject.put("code", 200);
		System.out.println(jsonObject.toJSONString());
		String encryptParams = new String(AESUtil.encrypt(jsonObject.toJSONString(), AESUtil.KEY, AESUtil.IV));

		String dencryptParams = AESUtil.decrypt(encryptParams, AESUtil.KEY, AESUtil.IV);

		// 将查出来的值插入数据库
		String insertUrl = /*this.base.toString() + */"http://localhost:9000/data-conversion/api/sys/sign-hospital-eqp-info/addWebHospitalEqpInfo?params="+encryptParams;
		System.out.println(testRestTemplate.postForObject(insertUrl, null, WebHospitalEqpInfo.class));
	}

	public static void main(String[] args) {
		String str = "{\"id\":5,\"clinic\":\"0001\",\"drugCode\":\"600603\",\"barCode\":\"\",\"drugName\":\"丹皮酚软膏\",\"drugAlias\":\"\",\"drugSpec\":\"20g\",\"packingUnit\":\"支\",\"packingQty\":1,\"pcsRetailUnit\":\"支\",\"baseDose\":1.0000,\"baseDoseUnit\":\"支\",\"doseCode\":\"22\",\"financialCode\":\"L01\",\"drugUsingType\":\"1\",\"classficationCode\":\"\",\"approvedNo\":\"z34020837\",\"ftyNo\":\"\",\"ftyName\":\"合肥立方制药股份有限公司\",\"method\":\"外用\",\"usagePerTime\":0.1000,\"usagePerTimeUnit\":\"\",\"frequency\":\"每天3次\",\"frequencyValue\":3,\"days\":0,\"drugRemark\":\"\",\"drugEfficiency\":\"\",\"status\":\"1\",\"sysCode\":\"\",\"pinYin\":\"dpfrg\",\"prescriptionType\":\"1\",\"bitCode\":\"\",\"projectType\":\"2\",\"antibacterial\":\"0\",\"retailOrNot\":\"0\",\"medInsuranceCode\":\"\",\"setRetailPrice\":25.00,\"pcsRetailPrice\":25.00,\"setRetailUnit\":\"支\",\"updatedTime\":\"2021-01-06T01:59:06.000+0000\",\"specialMaterial\":\"0\",\"payOffCode\":\"BASE006\",\"salesQty\":null}";
		JSONObject jsonObject = (JSONObject) JSONObject.parse(str);
		Set<String> keys = jsonObject.keySet();
		System.out.println(keys.size());
		for(String k:keys){
			System.out.println(k);
		}
	}

}