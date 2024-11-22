package com.example.pr2_remake;

import com.google.gson.annotations.SerializedName;

public class Forecasts {
    @SerializedName("date")
    private String date;

    @SerializedName("parts")
    private Parts parts;

    public String getDate() {
        return date;
    }

    public Parts getParts() {
        return parts;
    }
    public void setParts(Parts parts) {
        this.parts = parts;
    }
}
