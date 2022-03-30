package com.book.neo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BookFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.info("BookFilter :: doFilter");
		log.info("server name:" +request.getServerName());
		log.info("server port:" +request.getServerPort());
		log.info("protocol:" +request.getProtocol());
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		log.info("URI :" +httpServletRequest.getRequestURI());
		log.info("Method :" +httpServletRequest.getMethod());

		chain.doFilter(request, response);
	} 

}
