package com.fatec.sp.gov.br.consumo.ProdutoApi;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fatec.sp.gov.br.consumo.ProdutoApi.service.ConsomeApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProdutoApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsomeApi lerApi = new ConsomeApi();
		String dados = lerApi.obterDados("https://api.escuelajs.co/api/v1/products/");

		ObjectMapper objMapper = new ObjectMapper();
		JsonNode jsonNode = objMapper.readTree(dados);

		List<JsonNode> jsonList = new ArrayList<>();
		jsonNode.forEach(jsonList::add);

		List<Integer> prodPrices = jsonList.stream()
				.map(price -> price.get("price")
						.asInt())
				.filter(price -> price < 30)
				.toList();

		List<String> prodName = jsonList.stream()
				.filter(produto -> produto.get("price").asDouble() < 30)
				.map(produto -> produto.get("title").asText())
				.toList();


		List<String> productsInfo = new ArrayList<>();

		for(int i = 0; i < prodName.size(); i++){
			productsInfo.add(prodName.get(i).toUpperCase() + " - R$" + prodPrices.get(i));
		}

		System.out.println("\n\nOfertas Imperdíveis \n\n");
		productsInfo.forEach(System.out::println);
	}
}
