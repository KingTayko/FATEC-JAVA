package com.gerenciadorTarefas.gerenciador.model;

public class Tarefa {
    private final int id;
    private final String desc;
    private boolean concluida;

    //Constructor:
    public Tarefa(int id, String desc, boolean concluida) {
        this.id = id;
        this.desc = desc;
        this.concluida = concluida;
    }

    //Getters and Setters:


    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", desc:" + desc +
                ", concluida:" + concluida +
                "}";
    }
}
