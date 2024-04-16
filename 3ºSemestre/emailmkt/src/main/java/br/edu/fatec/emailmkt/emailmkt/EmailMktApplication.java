package br.edu.fatec.emailmkt.emailmkt;

import br.edu.fatec.emailmkt.emailmkt.service.ConsomeApi;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EmailMktApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmailMktApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsomeApi lerApi = new ConsomeApi();
		String dados = lerApi.obterDados("https://jsonplaceholder.typicode.com/comments");

		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(dados);

		List<JsonNode> jsonList = new ArrayList<>();
		jsonNode.forEach(jsonList::add);

		List<String> emails = jsonList.stream()
				.map(email -> email.get("email").asText())
				.toList();

		emails.forEach(System.out::println);

		System.out.println("\n" + emails.size() + "e-mails foram enviados!");
	}
}
