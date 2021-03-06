package xyz.michaeljohnson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@EnableConfigServer
public class ResumeWebsiteApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeWebsiteApiApplication.class, args);
	}
}
