package com.example.pr2_remake;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("v2/forecast")
    @Headers("X-Yandex-API-Key: demo_yandex_weather_api_key_ca6d09349ba0")
    Call<WeatherResponse>getWeather(
            @Query("lat") double lat,
            @Query("lon") double lon,
            @Query("lang") String lang,
            @Query("limit") int limit,
            @Query("hours") boolean hours,
            @Query("extra") boolean extra
    );
}
