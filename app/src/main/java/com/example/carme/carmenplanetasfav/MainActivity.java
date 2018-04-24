package com.example.carme.carmenplanetasfav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Planeta> listaPlanetas;
    RecyclerView recyclerView;
    PlanetaAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPlanetas = fillList();

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this );
        adapter= new PlanetaAdapter(this, listaPlanetas);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<Planeta> fillList(){
        String info1 = "El Sol es una estrella. El Sistema Solar está compuesto por el Sol y nueve planetas. Todos los planetas giran alrededor de el en la misma dirección.";
        String info2 = "Es el primer planeta pues está más cerca del Sol.\n" +
                "            Como Plutón ya no es un planeta, se convirtió en el más pequeño de todo el Sistema Solar.\n" +
                "            Tarda 88 días en dar una vuelta completa alrededor del Sol";
        String info3 = "El segundo planeta más cercano al Sol, pero el más caliente ya que los gases de su atmósfera casi no dejan escapar el calor.\n" +
                "            Es más pequeño que la Tierra, y tarda unos 225 días en terminar una órbita alrededor del “astro rey”.\n" +
                "            A diferencia de los demás planetas, gira hacia atrás, o en dirección contraria a la usual";
        String info4 = "Es el tercer planeta en orden de cercanía al Sol, y tú lo conoces.\n" +
                "            Hasta ahora, es el único que tiene seres vivos, océanos de agua, mucho oxígeno e infinidad de maravillas naturales.\n" +
                "            Se formó poco después de que comenzó a formarse el Sol, hace unos 4.5 billones de años";
        String info5 = "Algunas personas lo llaman “planeta rojo”, porque su superficie tiene óxido de hierro, un material de color rojizo.\n" +
                "            Al igual que los tres planetas anteriores, su suelo es de roca sólida.\n" +
                "            Actualmente, los científicos se han interesado en Marte porque creen que pudo o podría albergar vida, incluso esperan que en años futuros algunas personas vayan a vivir ahí";
        String info6 = "Un cinturón de asteroides separa a Marte de Júpiter, que es el planeta más grande del Sistema Solar.\n" +
                "            Es una enorme bola de gas y tiene más satélites que ningún otro planeta.\n" +
                "            La Gran Mancha Roja, una tormenta que parece un remolino, es incluso más grande que la Tierra";
        String info7 = "Otra bola de gas, pero mejor conocida por tener un impresionante conjunto de anillos compuestos por millones de pedacitos de hielo.\n" +
                "            Es el sexto más cercano al Sol, y está a una distancia de 1.4 billones de kilómetros de distancia de él";
        String info8 = "Tiene unos anillos delgados, pero no son tan visibles como los de Saturno.\n" +
                "            Es un planeta casi el doble de grande de Neptuno y se ve de color azul porque tiene un gas llamado metano.\n" +
                "            No gira sobre sí mismo como los demás: en vez de hacerlo de forma similar a la de la Tierra, lo hace de costado";
        String info9 = "El gaseoso más pequeño y el más lejano del Sol. Por lo tanto, un planeta helado.\n" +
                "            Tiene vientos sumamente fuertes y tarda 165 años en completar su órbita.\n" +
                "            Apenas en 2011 terminó su recorrido alrededor del Sol desde que fue descubierto en 1846.";







        ArrayList<Planeta> l  = new ArrayList<>();
        l.add(new Planeta(1, "Sol", info1 ));
        l.add(new Planeta(2,"Mercurio", info2));
        l.add(new Planeta(3,"Venus", info3));
        l.add(new Planeta(4,"Tierra", info4));
        l.add(new Planeta(5,"Marte", info5));
        l.add(new Planeta(6,"Jupiter", info6));
        l.add(new Planeta(7,"Saturno", info7));
        l.add(new Planeta(8,"Urano", info8));
        l.add(new Planeta(9,"Neptuno", info9));




        return l;
    }
}
