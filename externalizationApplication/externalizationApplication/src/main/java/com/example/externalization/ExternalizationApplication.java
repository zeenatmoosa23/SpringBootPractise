package com.example.externalization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.externalization.AppConfig;


@SpringBootApplication
public class ExternalizationApplication implements CommandLineRunner{
	private static final Logger LOGGER = LoggerFactory.getLogger(ExternalizationApplication.class);

	@Value("${app.name}")
	private String name;
	
	@Autowired
	private AppConfig appConfig;
	

	public static void main(String[] args) {
		SpringApplication.run(ExternalizationApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("Currently executing app:{}", name);
		LOGGER.info("With message:{}",appConfig.getMessge());
	}
}
