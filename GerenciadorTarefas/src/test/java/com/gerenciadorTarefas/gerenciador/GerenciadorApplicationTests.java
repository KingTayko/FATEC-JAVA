package com.gerenciadorTarefas.gerenciador;

import com.gerenciadorTarefas.gerenciador.model.Tarefa;
import com.gerenciadorTarefas.gerenciador.service.RedisTasks;
import com.gerenciadorTarefas.gerenciador.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

@SpringBootTest
class GerenciadorApplicationTests implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorApplicationTests.class, args);
	}

	@Test
	void contextLoads() {
	}

	@Override
	public void run(String... args) throws Exception {

		try {
			Jedis jedis = RedisUtil.getJedis();
			RedisTasks all = new RedisTasks();

			Tarefa t1 = new Tarefa(1, "Comprar pão", false);
			Tarefa t2 = new Tarefa(2, "Ir ao cinema", true);

			all.adicionarTarefa(t1);
			all.adicionarTarefa(t2);

			all.excluirTarefa(t1);
			all.excluirTarefa(t2);

			all.excluirTodasTarefas();

			System.out.println(all.listarTarefas());


			RedisUtil.closeJedis();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}


	}
}
