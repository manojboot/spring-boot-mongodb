package com.book.neo.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BookAPIInterceptor implements HandlerInterceptor{
	
		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
					throws Exception {
			log.info("PreHandle Request");	
			System.out.println("Log Reques" +request.getRequestURI());
			return true;
		}
		
		@Override
		public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
			log.info("PostHandle Request");
			System.out.println("current time" +new Date());

		}
		
		@Override
		public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
			log.info("After Completion");
		}
}
