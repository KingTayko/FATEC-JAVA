package com.fipe.fipeApi.services;

import java.util.List;

public interface IConverteFipe {
    <T> T enviaFipe(String json, Class<T> classe);
}
