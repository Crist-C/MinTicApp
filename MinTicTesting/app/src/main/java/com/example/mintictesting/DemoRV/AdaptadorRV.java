package com.example.mintictesting.DemoRV;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mintictesting.Login;
import com.example.mintictesting.R;

import java.util.ArrayList;

public class AdaptadorRV extends RecyclerView.Adapter<AdaptadorRV.InicioRVViewHolder> {

    private final Activity contexto;
    private final ArrayList<PojoContactos> pojoContactosArrayList;

    public AdaptadorRV(Activity contexto, ArrayList<PojoContactos> pojoContactosArrayList) {
        this.contexto = contexto;
        this.pojoContactosArrayList = pojoContactosArrayList;
    }

    @NonNull
    @Override
    public InicioRVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View Itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_contactos, parent, false);
        return new InicioRVViewHolder(Itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull InicioRVViewHolder holder, int position) {

        final PojoContactos pojoContactos = pojoContactosArrayList.get(position);
/*
        Picasso.get()
                .load(pojoContactos.getFoto())
                  .placeholder(R.drawable.ic_baseline_people_24)
                .into(holder.ivFoto);
*/
        holder.ivFoto.setImageResource(pojoContactos.getFoto());

        holder.ivFoto.setOnClickListener(v -> {
            Toast.makeText(contexto, "Soy una foto", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(contexto, Login.class);
            contexto.startActivity(intent);

        });

        holder.tvNombre.setText(pojoContactos.getNombre());
        holder.tvTelefono.setText(pojoContactos.getTelefono());


    }

    @Override
    public int getItemCount() {
        return pojoContactosArrayList.size();
    }

    public static class InicioRVViewHolder extends RecyclerView.ViewHolder {

        private final ImageView ivFoto;
        private final TextView tvNombre;
        private final TextView tvTelefono;

        public InicioRVViewHolder(@NonNull View itemView) {
            super(itemView);

            ivFoto = itemView.findViewById(R.id.ivFotoV);
            tvNombre = itemView.findViewById(R.id.tvNombreV);
            tvTelefono = itemView.findViewById(R.id.tvTelefonoV);

        }
    }
}
