package com.example.homework_3_3mes;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FootballPlayerAdapter extends RecyclerView.Adapter<FootballPlayerViewHolder> {
    private ArrayList<String> footballPlayerList;

    public FootballPlayerAdapter(ArrayList<String> footballPlayerList) {
        this.footballPlayerList = footballPlayerList;
    }

    @NonNull
    @Override
    public FootballPlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FootballPlayerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_football_players, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FootballPlayerViewHolder holder, int position) {
        holder.onBind(footballPlayerList.get(position));
    }

    @Override
    public int getItemCount() {
        return footballPlayerList.size();
    }
}
