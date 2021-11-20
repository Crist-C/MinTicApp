package com.example.mintictesting.deportes;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mintictesting.R;

import java.util.ArrayList;

public class AdaptadorRVDeporte extends RecyclerView.Adapter<AdaptadorRVDeporte.DeporteRVHolder> {

    private final Activity contexto;
    private final ArrayList<ContenedorDeporte> contenedorDeporteArrayList;

    public AdaptadorRVDeporte(Activity contexto, ArrayList<ContenedorDeporte> contenedorDeporteArrayList) {
        this.contexto = contexto;
        this.contenedorDeporteArrayList = contenedorDeporteArrayList;
    }

    @NonNull
    @Override
    public DeporteRVHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View IteView = LayoutInflater.from(parent.getContext()).inflate(R.layout.deporte_cardview, parent, false);
        return new DeporteRVHolder(IteView);
    }

    @Override
    public void onBindViewHolder(@NonNull DeporteRVHolder holder, int position) {

        ContenedorDeporte contenedorDeporte = contenedorDeporteArrayList.get(position);

        holder.bDeporteTitulo.setText(contenedorDeporte.getTextdeporteTitulo());
        holder.deporteDescription.setText(contenedorDeporte.getTextdeporteDescription());
        holder.deportePreview1.setImageResource(contenedorDeporte.getImagdeportePreview1());
        holder.deportePreview2.setImageResource(contenedorDeporte.getImagdeportePreview2());
        holder.deportePreview3.setImageResource(contenedorDeporte.getImagdeportePreview3());
        holder.deportePistaPreview1.setImageResource(contenedorDeporte.getImagdeportePistaPreview1());
        holder.deportePistaPreview2.setImageResource(contenedorDeporte.getImagdeportePistaPreview2());
        holder.deportePistaPreview3.setImageResource(contenedorDeporte.getImagdeportePistaPreview3());
        holder.deportePistaPreview4.setImageResource(contenedorDeporte.getImagdeportePistaPreview4());
        holder.deportePistaPreview5.setImageResource(contenedorDeporte.getImagdeportePistaPreview5());

        holder.bDeportePistas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(contexto, "Ir a Pistas Deporte: "+contenedorDeporte.getTextdeporteTitulo(), Toast.LENGTH_LONG);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contenedorDeporteArrayList.size();
    }

    public class DeporteRVHolder extends RecyclerView.ViewHolder {

        private final ImageView deportePreview1;
        private final ImageView deportePreview2;
        private final ImageView deportePreview3;
        private final ImageView deportePistaPreview1;
        private final ImageView deportePistaPreview2;
        private final ImageView deportePistaPreview3;
        private final ImageView deportePistaPreview4;
        private final ImageView deportePistaPreview5;
        private final Button bDeporteTitulo;
        private final Button bDeportePistas;
        private final TextView deporteDescription;

        public DeporteRVHolder(@NonNull View itemView) {
            super(itemView);

            deportePreview1 = itemView.findViewById(R.id.ivDeportePreview1V);
            deportePreview2 = itemView.findViewById(R.id.ivDeportePreview2V);
            deportePreview3 = itemView.findViewById(R.id.ivDeportePreview3V);
            deportePistaPreview1 = itemView.findViewById(R.id.ivDeportePistaPreview1V);
            deportePistaPreview2 = itemView.findViewById(R.id.ivDeportePistaPreview2V);
            deportePistaPreview3 = itemView.findViewById(R.id.ivDeportePistaPreview3V);
            deportePistaPreview4 = itemView.findViewById(R.id.ivDeportePistaPreview4V);
            deportePistaPreview5 = itemView.findViewById(R.id.ivDeportePistaPreview5V);
            bDeporteTitulo = itemView.findViewById(R.id.tbDeporteTitulo);
            bDeportePistas = itemView.findViewById(R.id.tbDeportePistas);
            deporteDescription = itemView.findViewById(R.id.tvDeporteDescription);

        }
    }
}
