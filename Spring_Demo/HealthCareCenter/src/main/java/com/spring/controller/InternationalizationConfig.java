package com.spring.controller;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


@Configuration
public class InternationalizationConfig implements WebMvcConfigurer {

	// Create a SessionLocaleResolver object and set the default locale to
		// English return the SessionLocaleResolver object

		@Bean
		public LocaleResolver localeResolver() {
			SessionLocaleResolver session = new SessionLocaleResolver();
			session.setDefaultLocale(Locale.ENGLISH);
			// fill the code
			return session;	
		}

		// Create LocaleChangeInterceptor object and set the parameter name as
		// language and return the localeChangeInterceptor
		@Bean
		public LocaleChangeInterceptor localeChangeInterceptor() {
			// fill the code
			LocaleChangeInterceptor local = new LocaleChangeInterceptor();
			local.setParamName("language");
			return local;

		}

		// register the LocaleChangeInterceptor
		@Override
		public void addInterceptors(InterceptorRegistry registry) {
			// fill the code
			registry.addInterceptor(localeChangeInterceptor());
		}
}	 	  	    	    		        	 	
