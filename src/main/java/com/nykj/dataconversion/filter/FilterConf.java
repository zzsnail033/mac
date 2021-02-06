package com.nykj.dataconversion.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springboot
 * @description:
 * @author: Sid
 * @date: 2018-11-19 13:48
 * @since: 1.0
 **/
//@Configuration
public class FilterConf {
//	@Bean
	public FilterRegistrationBean AuthFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new AuthFilter()); //设置自定义的Filter
		registration.addUrlPatterns("/*");  //设置过滤路径
		registration.setName("AuthFilter"); //设置过滤器名称
		registration.setOrder(1);   //设置过滤器顺序
		registration.addInitParameter("paramName", "paramValue");
		return registration;
	}

	/**
	 * /api/sys下的接口需要解密从写request
	 *
	 * @return
	 */
	@Bean
	public FilterRegistrationBean EncryptionFilter() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new DecryptFilter()); //设置自定义的Filter
		registration.addUrlPatterns("/api/sys/*");  //设置过滤路径
		registration.setName("DecryptFilter"); //设置过滤器名称
		registration.setOrder(2);   //设置过滤器顺序
		return registration;
	}
}