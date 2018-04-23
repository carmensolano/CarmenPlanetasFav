package com.example.carme.carmenplanetasfav;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PlanetaAdapter extends RecyclerView.Adapter<PlanetaAdapter.PlanetaViewHolder>{
    Context mCtx;
    List<Planeta> planetaList;

    public PlanetaAdapter(Context mCtx, List<Planeta> planetaList){
        this.mCtx = mCtx;
        this.planetaList = planetaList;
    }

    @Override
    public PlanetaViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater =LayoutInflater.from(mCtx);
        View v = inflater.inflate(R.layout.list_layout, parent, false );

        return new PlanetaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlanetViewHolder holder, int position){
        holder.ti
    }
}
