package com.example.pr2_remake;

import com.google.gson.annotations.SerializedName;

public class Parts {
    @SerializedName("day")
    private Day day;

    public Day getDay() {
        return day;
    }
    public void setDay(Day day) {
        this.day = day;
    }
}
