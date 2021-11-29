package com.example.mintictesting.Vistas.deportes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mintictesting.R;

import java.util.ArrayList;

public class DeportesRV extends AppCompatActivity {

    private RecyclerView rvDeportes;                    // Vista Recycler
    private LinearLayoutManager linearLayoutManager;    // Forma en que se van a organizar los elementos
    private GridLayoutManager gridLayoutManager;        // Forma en que se van a organizar los elementos
    private ArrayList<ContenedorDeporte> contenedorDeporteArrayList;    // El que Contiene la información de cada CardView
    private AdaptadorRVDeporte adaptadorRVDeporte;      // El que organiza toda la información en la vista cardView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deportes_rv);

        rvDeportes = findViewById(R.id.rvContenedorRVDeportesV);

        linearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 2);

        rvDeportes.setLayoutManager(linearLayoutManager);

        contenedorDeporteArrayList = new ArrayList<ContenedorDeporte>();
        contenedorDeporteArrayList.add(new ContenedorDeporte(
                R.drawable.trail_running2, R.drawable.trail_running3, R.drawable.trail_running5,
                R.drawable.tr_pista_circuito_quilotoa, R.drawable.tr_pista_cordillera_blanca, R.drawable.tr_pista_cruze_los_andes, R.drawable.tr_pista_valle_sagrado, R.drawable.trail_running1,
                "Trail Running", getString(R.string.TrailRunningDescription)
                ));

        contenedorDeporteArrayList.add(new ContenedorDeporte(
                R.drawable.rapel_preview1, R.drawable.rapel_preview2, R.drawable.rafting_preview3,
                R.drawable.tr_pista_circuito_quilotoa, R.drawable.tr_pista_cordillera_blanca, R.drawable.tr_pista_cruze_los_andes, R.drawable.tr_pista_valle_sagrado, R.drawable.trail_running1,
                "Rápel", getString(R.string.Descripcion_Rapel)
        ));

        contenedorDeporteArrayList.add(new ContenedorDeporte(
                R.drawable.parapente_preview2, R.drawable.parapente_preview2, R.drawable.parapente_preview3,
                R.drawable.tr_pista_circuito_quilotoa, R.drawable.tr_pista_cordillera_blanca, R.drawable.tr_pista_cruze_los_andes, R.drawable.tr_pista_valle_sagrado, R.drawable.trail_running1,
                "Parapente", getString(R.string.DescripciónParapente)
        ));

        contenedorDeporteArrayList.add(new ContenedorDeporte(
                R.drawable.escalada_preview1, R.drawable.escalada_preview2, R.drawable.escalada_preview3,
                R.drawable.escalada_preview4, R.drawable.escalada_preview5, R.drawable.tr_pista_cruze_los_andes, R.drawable.tr_pista_valle_sagrado, R.drawable.trail_running1,
                "Escalada", getString(R.string.DescipcionEscalada)
        ));


        contenedorDeporteArrayList.add(new ContenedorDeporte(
                R.drawable.rafting_preview1, R.drawable.rafting_preview2, R.drawable.rafting_preview3,
                R.drawable.tr_pista_circuito_quilotoa, R.drawable.tr_pista_cordillera_blanca, R.drawable.tr_pista_cruze_los_andes, R.drawable.tr_pista_valle_sagrado, R.drawable.trail_running1,
                "Rafting", getString(R.string.DescripcionRafting)
        ));


        contenedorDeporteArrayList.add(new ContenedorDeporte(
                R.drawable.surf_preview1, R.drawable.surf_preview2, R.drawable.surf_preview3,
                R.drawable.tr_pista_circuito_quilotoa, R.drawable.tr_pista_cordillera_blanca, R.drawable.tr_pista_cruze_los_andes, R.drawable.tr_pista_valle_sagrado, R.drawable.trail_running1,
                "Surf", getString(R.string.DescripcionSurf)
        ));

        contenedorDeporteArrayList.add(new ContenedorDeporte(
                R.drawable.futbol_preview1, R.drawable.futbol_preview2, R.drawable.futbol_preview3,
                R.drawable.tr_pista_circuito_quilotoa, R.drawable.tr_pista_cordillera_blanca, R.drawable.tr_pista_cruze_los_andes, R.drawable.tr_pista_valle_sagrado, R.drawable.trail_running1,
                "Futbol", getString(R.string.Descripcion_Futbol)
        ));

        adaptadorRVDeporte = new AdaptadorRVDeporte(this,contenedorDeporteArrayList);
        rvDeportes.setAdapter(adaptadorRVDeporte);



    }
}