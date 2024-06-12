package com.fipe.fipeApi.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record Fipe(@JsonAlias("codigo") String codigo,
                   @JsonAlias("nome") String nome) {

    @Override
    public String toString() {
        return "Fipe{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
