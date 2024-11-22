package com.example.pr2_remake;

import android.os.Bundle; import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class MainActivity extends AppCompatActivity {
    private TextView tvTemperature;
    private RecyclerView rcForecast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTemperature = findViewById(R.id.tvTemperature);
        rcForecast = findViewById(R.id.rcForecast);

        getWeatherData();
    }
    private void getWeatherData() {
        RetrofiteInstans.api.getWeather(
                56.31087359573214, 44.00495618366581,  "ru_RU", 7, true, false
        ).enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                if (response.isSuccessful()) {
                    WeatherResponse weatherResponse = response.body();
                    if (weatherResponse != null) {
                        updateUI(weatherResponse);
                    }
                }
            }
            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
// Обработка ошибки
            }
        });
    }
    private void updateUI(WeatherResponse weatherResponse) {
        String temp = weatherResponse.getFact().getTemp() + "°";
        tvTemperature.setText(temp);

        ForecastAdapter forecastAdapter = new ForecastAdapter(weatherResponse.getForecasts());
        rcForecast.setLayoutManager(new LinearLayoutManager(this));
        rcForecast.setAdapter(forecastAdapter);
    }
}