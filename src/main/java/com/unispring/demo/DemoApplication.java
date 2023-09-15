package com.unispring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The entry point of the UniSpring app.
 * <p>
 * This class is responsible for bootstrapping the application, which includes
 * initializing the Spring Boot environment and launching the embedded server.
 * </p>
 *
 * @author iulianbuga
 * @version 1.0
 * @since 1.0
 */
@SpringBootApplication()
public class DemoApplication {
	/**
	 * The main method that serves as the entry point for the application.
	 *
	 * @param args Arguments that can be passed to the application.
	 */
	public static void main(final String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
