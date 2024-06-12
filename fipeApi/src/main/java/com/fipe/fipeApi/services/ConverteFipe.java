package com.fipe.fipeApi.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteFipe implements IConverteFipe {
    ObjectMapper objMapper = new ObjectMapper();

    @Override
    public <T> T enviaFipe(String json, Class<T> classe) {
        try {
            return objMapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

