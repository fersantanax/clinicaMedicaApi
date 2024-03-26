package br.com.cotiinformatica.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI customOpenApi() {

		return new OpenAPI().components(new Components())
				.info(new Info().title("API Clinica Médica - Exercício por Fernanda Santana")
						.description("Projeto Spring Boot API para controle de atividades para clinica médica")
						.version("v1")
						.contact(new Contact().name("Fernanda Santana").email("contato@cotiinformatica.com.br")
								.url("https://www.cotiinformatica.com.br"))
						.license(new License().name("Licença").url("https://www.cotiinformatica.com.br"))
						.termsOfService("https://www.cotiinformatica.com.br"));
	}
}