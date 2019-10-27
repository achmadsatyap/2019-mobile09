package com.satya.recycleviewgambardantextsertascroll.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.satya.recycleviewgambardantextsertascroll.R;
import com.satya.recycleviewgambardantextsertascroll.models.SuperHero;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SuperHeroAdapter extends RecyclerView.Adapter<SuperHeroAdapter.MyViewHolder> {
    List<SuperHero> heroList;

    public SuperHeroAdapter(List<SuperHero> heroList) {
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View superHeroView = layoutInflater.inflate(R.layout.item_super_hero, parent,false);
        MyViewHolder viewHolder = new MyViewHolder(superHeroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SuperHero hero = heroList.get(position);
        holder.heroName.setText(hero.getHeroName());
        holder.heroText.setText(hero.getHeroText());
        holder.heroImageView.setImageResource(hero.getHeroImage());
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView heroName;
        public TextView heroText;
        public ImageView heroImageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            heroName = itemView.findViewById(R.id.heroName);
            heroText = itemView.findViewById(R.id.heroText);
            heroImageView = itemView.findViewById(R.id.heroImage);
        }
    }
}
