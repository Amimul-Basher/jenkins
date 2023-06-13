package com.amimul.jenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {
	public static final Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);

<<<<<<< HEAD

=======
>>>>>>> 7dd69e2ea754307a40aa10e1275ce274113117c5
	public void init(){
		logger.info("The application is getting started");
	}
	public static void main(String[] args) {
		logger.info("The application is running");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

<<<<<<< HEAD

=======
>>>>>>> 7dd69e2ea754307a40aa10e1275ce274113117c5
}
