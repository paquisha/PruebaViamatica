package com.grijalva.loginback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class LoginBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginBackApplication.class, args);
	}


	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.addAllowedOrigin("*"); // Permitir todas las solicitudes desde cualquier origen
		config.addAllowedMethod("*"); // Permitir todos los métodos HTTP
		config.addAllowedHeader("*"); // Permitir todas las cabeceras
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}

}
