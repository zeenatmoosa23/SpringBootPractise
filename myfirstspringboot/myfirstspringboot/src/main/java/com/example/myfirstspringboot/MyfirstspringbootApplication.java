package com.example.myfirstspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstspringbootApplication implements CommandLineRunner {
	
private static final Logger LOGGER = LoggerFactory.getLogger(MyfirstspringbootApplication.class);
	public static void main(String[] args)  {
		SpringApplication.run(MyfirstspringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("This is an info msg");
		LOGGER.warn("This is a warning message");
		LOGGER.debug("This is a debug message");
	
		
	}

	
}
