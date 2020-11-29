package com.ouysb.test.config;
//package com.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{//此类作用相当于是web.xml；用于java类配置取代xml配置,可以添加filter,listener
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		//关闭csrf
//		http.csrf().disable();
//		//支持httpbasic
//		http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
//	}
//}
