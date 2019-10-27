package com.satya.recycleviewgambardantextsertascrollmenggunakangridlayoutmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.satya.recycleviewgambardantextsertascrollmenggunakangridlayoutmanager.adapters.SuperHeroAdapter;
import com.satya.recycleviewgambardantextsertascrollmenggunakangridlayoutmanager.models.SuperHero;

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
                "Petruk",
                "Petruk adalah tokoh punakawan dalam pewayangan Jawa, di pihak keturunan/trah Witaradya. Petruk tidak disebutkan dalam kitab Mahabarata dari India. Keberadaan tokoh ini dalam dunia pewayangan merupakan gubahan asli masyarakat Jawa. Di ranah Pasundan (Jawa Barat), tokoh Petruk lebih dikenal dengan nama Dawala atau Udel.",
                R.drawable.petruk));
        listSuperHero.add(new SuperHero(
                "Gareng",
                "Gareng adalah punakawan yang berkaki pincang. Hal ini merupakan sebuah sanepa dari sifat Gareng sebagai kawula yang selalu hati-hati dalam bertindak. Selain itu, cacat fisik Gareng yang lain adalah tangan yang ciker atau patah.",
                R.drawable.gareng));
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
