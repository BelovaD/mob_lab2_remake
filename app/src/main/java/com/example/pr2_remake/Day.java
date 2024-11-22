package com.example.pr2_remake;

import com.google.gson.annotations.SerializedName;

public class Day {
    @SerializedName("temp_max")
    private int temp_max;
    @SerializedName("temp_min")
    private int temp_min;
    @SerializedName("condition")
    private String condition;

    public int getTemp_max(){
        return temp_max;
    }
    public int setTemp_max(int temp_max){
        return temp_max = temp_max;
    }
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition){
        this.condition = condition;
    }
    public int getTemp_min() {
        return temp_min;
    }
    public void setTemp_min(int temp_min) {
        this.temp_min=temp_min;
    }
}
