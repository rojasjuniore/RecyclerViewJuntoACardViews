package com.rojasjuniore.recyclerviewjuntoacardviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List items = new ArrayList();
        items.add(new Motivation(R.drawable.a, "Anónimo", 230));
        items.add(new Motivation(R.drawable.b, "Anónimo", 456));
        items.add(new Motivation(R.drawable.c, "Anónimo", 342));
        items.add(new Motivation(R.drawable.d, "Anónimo", 645));
        items.add(new Motivation(R.drawable.e, "Anónimo", 459));
        items.add(new Motivation(R.drawable.f, "Anónimo", 230));
        items.add(new Motivation(R.drawable.g, "Anónimo ", 456));
        items.add(new Motivation(R.drawable.h, "Anónimo", 342));
        items.add(new Motivation(R.drawable.i, "Anónimo", 645));
        items.add(new Motivation(R.drawable.j, "Anónimo", 459));

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new AdaptadorMotivation(items);
        recycler.setAdapter(adapter);
    }
}
