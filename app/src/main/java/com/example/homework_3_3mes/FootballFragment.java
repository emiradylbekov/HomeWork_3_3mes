package com.example.homework_3_3mes;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FootballFragment extends Fragment {
    private RecyclerView rvFootballPlayer;
    private ArrayList<String> footballPlayerList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_football, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvFootballPlayer = requireActivity().findViewById(R.id.rv_football_players);
        loadData();
        FootballPlayerAdapter footballPlayerAdapter = new FootballPlayerAdapter(footballPlayerList);
        rvFootballPlayer.setAdapter(footballPlayerAdapter);
    }
    private void loadData() {
        footballPlayerList.add("Cristiano Ronaldo");
        footballPlayerList.add("Leonel Messi");
        footballPlayerList.add("Neymar");
        footballPlayerList.add("Sadio Mane");
        footballPlayerList.add("Mohamed Salah");
        footballPlayerList.add("Kevin De Bruyne");
        footballPlayerList.add("Kilian Mbappe");
        footballPlayerList.add("Karim Benzema");
        footballPlayerList.add("Robert Lewandowski");
        footballPlayerList.add("Vinicius Junior");
        footballPlayerList.add("Luka Modric");
        footballPlayerList.add("Toni Kross");
        footballPlayerList.add("Erling Haaland");
        footballPlayerList.add("Son Heung Min");
        footballPlayerList.add("Harry Kane");
    }
}