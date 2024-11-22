package com.example.pr2_remake;

import com.google.gson.annotations.SerializedName;

public class Fact {
    @SerializedName("temp")
    private int temp;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
