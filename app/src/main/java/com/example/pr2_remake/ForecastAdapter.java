package com.example.pr2_remake;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder> {
   private List<Forecasts> forecasts;

   public ForecastAdapter(List<Forecasts> forecasts) {
       this.forecasts=forecasts;
   }

   @NonNull
   @Override
    public ForecastAdapter.ForecastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_forecast,parent,false);
       return new ForecastViewHolder(view);
   }


   @Override
   public void onBindViewHolder(@NonNull ForecastAdapter.ForecastViewHolder holder, int position) {
       Forecasts forecast = forecasts.get(position);
       String day = forecast.getDate();
       holder.dayTextView.setText(day);
       String temp = forecast.getParts().getDay().getTemp_max() + "°/" + forecast.getParts().getDay().getTemp_min() + "°";
       holder.temperatureTextView.setText(temp);
   }
    @Override
    public int getItemCount() {
        return forecasts.size();
    }
    class ForecastViewHolder extends RecyclerView.ViewHolder {
        TextView dayTextView;
        TextView temperatureTextView;
        public ForecastViewHolder(@NonNull View item) {
            super(item);
            dayTextView = item.findViewById(R.id.tvDay);
            temperatureTextView = item.findViewById(R.id.tvTemp);
        }
    }
}

