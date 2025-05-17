package com.site.harvest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.site")
public class HarvestApplication {
	public static void main(String[] args) {
		SpringApplication.run(HarvestApplication.class, args);
	}

}
