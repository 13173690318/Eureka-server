package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp extends SpringBootServletInitializer {
//继承SpringBootServletInitializer主要是传统spring项目有很多web.xml配置;
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApp.class, args);
		System.out.println("Eureka服务端启动完毕....");
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		//当使用外置服务器时，
		return builder.sources(EurekaServerApp.class);//SpringBoot04WebJspApplication.class
	}
}
