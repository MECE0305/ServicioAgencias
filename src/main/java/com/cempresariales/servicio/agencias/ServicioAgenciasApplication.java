package com.cempresariales.servicio.agencias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EntityScan({"com.cempresariales.servicio.commons.model.entity"})
public class ServicioAgenciasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioAgenciasApplication.class, args);
	}

}
