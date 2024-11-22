package com.example.pr2_remake;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class WeatherResponse {
    @SerializedName("fact")
    private Fact fact;
    @SerializedName("forecasts")
    private List<Forecasts> forecasts = new ArrayList<>();

    public List<Forecasts> getForecasts() {
        return forecasts;
    }

    public Fact getFact() {
        return fact;
    }

    public void setFact(Fact fact) {
        this.fact = fact;
    }
}
