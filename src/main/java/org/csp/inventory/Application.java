package org.csp.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.integration.annotation.IntegrationComponentScan;

@SpringBootApplication
@IntegrationComponentScan
public class Application {

	public static ConfigurableApplicationContext context = null;
	
	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
	}

}
