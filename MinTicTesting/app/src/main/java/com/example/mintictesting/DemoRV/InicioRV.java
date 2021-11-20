package com.example.mintictesting.DemoRV;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mintictesting.R;

import java.util.ArrayList;

public class InicioRV extends AppCompatActivity {

    private RecyclerView rv_inicio;
    private LinearLayoutManager linearLayoutManager;
    private GridLayoutManager gridLayoutManager;
    private ArrayList<PojoContactos> pojoContactosArrayList;
    private ArrayList<String> nombreArrataList;
    private AdaptadorRV adaptadorRV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_rv);

        rv_inicio =  findViewById(R.id.rv_Inicio);


        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        gridLayoutManager = new GridLayoutManager(this, 2);

        rv_inicio.setLayoutManager(linearLayoutManager);

        pojoContactosArrayList = new ArrayList<PojoContactos>();
        pojoContactosArrayList.add(new PojoContactos(R.drawable.ic_baseline_add_ic_call_24, "Jesus", "332423423", "jesus@gmail.com"));
        pojoContactosArrayList.add(new PojoContactos(R.drawable.ic_baseline_add_ic_call_24, "Maria", "123323423", "Maria@gmail.com"));
        pojoContactosArrayList.add(new PojoContactos(R.drawable.ic_baseline_add_ic_call_24, "Andrea", "39679789", "Andrea@gmail.com"));
        pojoContactosArrayList.add(new PojoContactos(R.drawable.ic_baseline_add_ic_call_24, "Gabriela", "98778789", "Gabriela@gmail.com"));
        pojoContactosArrayList.add(new PojoContactos(R.drawable.ic_baseline_add_ic_call_24, "Wilmer", "332423423", "Wilmer@gmail.com"));
        pojoContactosArrayList.add(new PojoContactos(R.drawable.ic_baseline_add_ic_call_24, "Cristian", "001292342", "Cristian@gmail.com"));

        adaptadorRV = new AdaptadorRV(this, pojoContactosArrayList);

        rv_inicio.setAdapter(adaptadorRV);

    }
}