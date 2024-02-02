package com.javafruit.DockerComposePractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DockerComposePracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerComposePracticeApplication.class, args);
	}

}
