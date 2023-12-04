package com.org;


//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@SpringBootApplication
@ComponentScan("com.org.model")
@ComponentScan("com.org.dao")
@ComponentScan("com.org.service")
@ComponentScan("com.org.controller")
public class FmsSpringBootBackendApplication  {

	//static Logger logger= LogManager.getLogger(FmsSpringBootBackendApplication.class);
	private static final Logger logger = LogManager.getLogger(FmsSpringBootBackendApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FmsSpringBootBackendApplication.class, args);
		//logger.info("MySpringBootApplication started successfully!!!");
		//logger.debug("Debugging log");
		logger.info("Info log");
		logger.warn("Hey, This is a warning!");
		logger.error("Oops! We have an Error. OK");
		//logger.fatal("Damn! Fatal error. Please fix me.");
	}

	//@Override
	//public void run(ApplicationArguments applicationArguments) throws Exception {

	}

