package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//este fue mi primer proyecto para comrpobar el funcionamiento de los microservicios

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@RestController
public class Proyecto2Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto2Application.class, args);
	}
	@RequestMapping(value = "/")
	   public String home() {
	      return "Eureka Client application";
	   }
}
