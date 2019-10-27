package com.satya.recycleviewgambardantext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.satya.recycleviewgambardantext.adapters.SuperHeroAdapter;
import com.satya.recycleviewgambardantext.models.SuperHero;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvSuperHero;
    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSuperHero = findViewById(R.id.rvSuperHero);

        listSuperHero.add(new SuperHero(
                "Kopi",
                "Kopi adalah minuman hasil seduhan biji kopi yang telah disangrai dan dihaluskan menjadi bubuk.",
                R.drawable.kopi));
        listSuperHero.add(new SuperHero(
                "Kucing",
                "Kucing salah satu hewan peliharaan terpopuler di dunia.",
                R.drawable.kucing));
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
