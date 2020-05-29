package com.servicio.producto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.servicio.commons.model.entity"})
public class SpringBootServicioProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServicioProductosApplication.class, args);
	}

}
