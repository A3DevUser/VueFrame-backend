package com.Backend.VueFrame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.Backend.VueFrame.Model")

public class VueFrameApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueFrameApplication.class, args);
	}

}
