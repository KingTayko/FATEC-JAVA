package com.fipe.fipeApi.model;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record FipeValor(@JsonAlias("TipoVeiculo") String tipo,
                        @JsonAlias("Valor") String valor,
                        @JsonAlias("Marca") String marca,
                        @JsonAlias("Modelo") String modelo,
                        @JsonAlias("AnoModelo") String anoModelo,
                        @JsonAlias("Combustivel") String combustivel,
                        @JsonAlias("CodigoFipe") String codFipe,
                        @JsonAlias("MesReferencia") String mesRef,
                        @JsonAlias("SiglaCombustivel") String sigla) {

    @Override
    public String toString() {
        return "FipeValor{" +
                "tipo='" + tipo + '\'' +
                ", valor='" + valor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoModelo='" + anoModelo + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", codFipe='" + codFipe + '\'' +
                ", mesRef='" + mesRef + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
