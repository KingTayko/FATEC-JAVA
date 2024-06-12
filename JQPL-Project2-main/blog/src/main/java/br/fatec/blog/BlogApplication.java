package br.fatec.blog;

import br.fatec.blog.model.Comentario;
import br.fatec.blog.model.Post;
import br.fatec.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class BlogApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
	@Autowired
	private BlogRepository blogRepository;

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String tituoPost,descricaoPost,autorComentario,conteudoComentado;

		System.out.print("Digite o nome do Post: ");
		tituoPost = sc.nextLine();
		System.out.printf("Do que se trata %s ?", tituoPost);
		descricaoPost = sc.nextLine();
		Post post = new Post(tituoPost,descricaoPost);

		System.out.print("Nome do autor: ");
		autorComentario = sc.nextLine();
		System.out.println("Digite seu comentàrio:  ");
		conteudoComentado = sc.nextLine();
		Comentario comentario = new Comentario(autorComentario,conteudoComentado,post);
		post.setComentarios(comentario);
		blogRepository.save(post);

		System.out.println(post);
		List<Post> comentarios = blogRepository.findByKeyword("minha receita");;
		comentarios.forEach(System.out::println);


		sc.close();
	}
}
