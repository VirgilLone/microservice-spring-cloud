package com.lw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaHAApplication {
  public static void main(String[] args) {
    SpringApplication.run(EurekaHAApplication.class, args);
  }
}