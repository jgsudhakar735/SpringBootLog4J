package com.jgsudhakar.springboot.log4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLog4JApplication {

	public static void main(String[] args) {
		// to enable loggers as async
		System.setProperty("log4j2.contextSelector","org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
		SpringApplication.run(SpringBootLog4JApplication.class, args);
	}

}
