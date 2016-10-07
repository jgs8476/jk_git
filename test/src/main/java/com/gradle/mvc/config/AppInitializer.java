package com.gradle.mvc.config;

import javax.servlet.*;

import org.springframework.web.filter.*;
import org.springframework.web.servlet.support.*;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {
			AppConfig.class
		};
	}
	
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		
		return new Filter[] {
				characterEncodingFilter
		};
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
}
