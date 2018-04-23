package com.example.carme.carmenplanetasfav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    List<Planetas> listaPlanetas;
    RecyclerView recyclerView;
    PlanetaAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPlanetas = fillList();

        reclyclerView =
    }
}
