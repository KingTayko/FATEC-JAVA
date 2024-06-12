package com.gerenciadorTarefas.gerenciador.util;
import redis.clients.jedis.Jedis;

public class RedisUtil {

    private static Jedis jedis;

    static {
        jedis = new Jedis("redis-15016.c308.sa-east-1-1.ec2.cloud.redislabs.com", 15016);
        jedis.auth("2tOxnTjOKr4cAZ5eTFwAouKnJEbXowfd");
    }

    public static Jedis getJedis() {
        return jedis;
    }

    public static void closeJedis() {
        jedis.close();
    }
}
