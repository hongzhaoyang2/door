/**
 * 
 */
package com.hongzhaoyang.learn.bridge.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author redSun
 * 2018年9月9日下午6:54:19
 *
 */
@Service
//@ComponentScan
public class WebAppConfig extends WebMvcConfigurerAdapter {
	@Autowired LoginInterceptor loginInterceptor;
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry)
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(loginInterceptor).addPathPatterns("/**");
		super.addInterceptors(registry);
	}

}
