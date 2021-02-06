package com.nykj.dataconversion;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan("com.nykj.dataconversion.sys.mapper")
@PropertySource(value = {"classpath:/propConfigs.properties"}, ignoreResourceNotFound = true, encoding = "utf-8")
public class DataConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataConversionApplication.class, args);
	}

}
