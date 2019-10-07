package com.and.luc.sil.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.and.luc.sil.security.SenhaUtils;

@SpringBootApplication
public class ApiRestfulSpringBootApplication {

	public static void main(String[] args) {
		String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
		System.out.println(senhaEncoded);
		boolean senhaValida = SenhaUtils.senhaValida("123456", senhaEncoded);
		System.out.println(senhaValida);
		SpringApplication.run(ApiRestfulSpringBootApplication.class, args);
	}

}
