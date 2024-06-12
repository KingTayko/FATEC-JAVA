package com.fipe.fipeApi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fipe.fipeApi.model.Fipe;
import com.fipe.fipeApi.model.FipeValor;
import com.fipe.fipeApi.services.ConsomeFipe;
import com.fipe.fipeApi.services.ConverteFipe;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FipeApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FipeApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsomeFipe consomeFipe = new ConsomeFipe();
		String json = consomeFipe.LerJson("https://parallelum.com.br/fipe/api/v1/carros/marcas/59/modelos/5940/anos/2014-3");

		ConverteFipe convert = new ConverteFipe();
		FipeValor amarok = convert.enviaFipe(json, FipeValor.class);

		System.out.println(json);

	}
}
