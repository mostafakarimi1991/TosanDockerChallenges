package com.DockerChallenges;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.DockerChallenges.controller"})
public class DockerChallenges {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DockerChallenges.class);
        application.run(args);
    }
}
