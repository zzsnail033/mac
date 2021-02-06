package com.nykj.dataconversion;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;


@Component
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataConversionApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DataConversionApplicationTests {


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
}
