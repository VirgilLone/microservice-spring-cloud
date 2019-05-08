package com.lw.cloud;

import com.lw.config.TestConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
//使TestConfiguration这个Configuration只作用于此RibbonClient而不是所有RibbonClient
@RibbonClient(name = "microservice-provider-user",configuration = TestConfiguration.class)
public class MicroserviceSimpleConsumerMovieRibbonApplication {

	@Bean
    //使RestTemplate实例有负载均衡的能力
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleConsumerMovieRibbonApplication.class, args);
	}
}
