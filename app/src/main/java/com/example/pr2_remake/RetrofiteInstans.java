package com.example.pr2_remake;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofiteInstans {
    private static final String BASE_URL = "https://api.weather.yandex.ru/";
    public static final WeatherApi api;

    static {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(WeatherApi.class);
    }
}
