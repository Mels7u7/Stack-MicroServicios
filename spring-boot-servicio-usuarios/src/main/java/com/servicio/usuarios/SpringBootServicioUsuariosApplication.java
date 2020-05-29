package com.servicio.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan({"com.servicio.commons.usuarios.model.entity"})
@SpringBootApplication
public class SpringBootServicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServicioUsuariosApplication.class, args);
	}

}
