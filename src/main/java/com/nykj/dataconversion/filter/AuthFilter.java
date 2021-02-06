package com.nykj.dataconversion.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhangchao
 * @version 1.0
 * @descripe 处理api路径权限
 * @date 2021/1/28 10:30 上午
 */

@Slf4j
public class AuthFilter extends OncePerRequestFilter {

	public static final String NO_CHECK_PATH = new StringBuilder(".*/")
			.append("|(/data-conversion/api/sys/doctor-basic-info/test)")
			.toString();

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		log.info("---------------进入到AuthFilter---------------");
		String path = request.getRequestURI();
		if (!path.matches(NO_CHECK_PATH)) {
			chain.doFilter(request, response);
		} else {
			chain.doFilter(request, response);
		}
	}
}
