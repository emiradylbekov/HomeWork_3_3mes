package com.example.homework_3_3mes;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FootballPlayerViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFootballPlayerName;
    public FootballPlayerViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFootballPlayerName = itemView.findViewById(R.id.tv_football_player_name);
    }
    public void onBind (String footballPlayer) {
        tvFootballPlayerName.setText(footballPlayer);
    }
}
