package com.gerenciadorTarefas.gerenciador.service;

import com.gerenciadorTarefas.gerenciador.model.Tarefa;
import com.gerenciadorTarefas.gerenciador.util.RedisUtil;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class RedisTasks {
    Jedis jedis = RedisUtil.getJedis();
    public Set<String> listarTarefas() {
        return jedis.keys("*");
    }

    public void adicionarTarefa(Tarefa tarefa){
        jedis.set("tarefa:" + tarefa.getId(), tarefa.toString());
    }

    public void excluirTarefa(Tarefa tarefa){
        jedis.del("tarefa:" + tarefa.getId());
    }

    public void excluirTodasTarefas(){
        jedis.flushAll();
    }

}


