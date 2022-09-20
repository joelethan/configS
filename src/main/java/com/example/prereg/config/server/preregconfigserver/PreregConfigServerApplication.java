package com.example.prereg.config.server.preregconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PreregConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreregConfigServerApplication.class, args);
	}
}
