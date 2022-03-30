package com.book.neo.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
	
		@Bean
		public FilterRegistrationBean<ActuatorFilter> registrationBean(){
			
			FilterRegistrationBean<ActuatorFilter> registrationBean = new FilterRegistrationBean<>();
			registrationBean.setFilter(new ActuatorFilter());
			registrationBean.addUrlPatterns("/actuator/*");
			return registrationBean;	
		}
		
		// Like Wise we Can write multiple Filter
}
