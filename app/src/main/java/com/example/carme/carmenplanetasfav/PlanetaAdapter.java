package com.example.carme.carmenplanetasfav;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        View v = inflater.inflate(R.layout.activity_lista_layout, parent, false );

        return new PlanetaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlanetaViewHolder holder, int position){
        holder.titulo.setText(planetaList.get(position).getTitulo());
        holder.info.setText(planetaList.get(position).getInfo());
    }

    @Override
    public int getItemCount(){
        return planetaList.size();
    }

    protected class PlanetaViewHolder extends RecyclerView.ViewHolder{
        TextView titulo, info;

        public PlanetaViewHolder (View itemView){
            super(itemView);

            titulo = itemView.findViewById(R.id.titulo);
            info = itemView.findViewById(R.id.info);
        }
    }
}
