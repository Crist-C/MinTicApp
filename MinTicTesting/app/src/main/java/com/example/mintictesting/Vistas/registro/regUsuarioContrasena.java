package com.example.mintictesting.Vistas.registro;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mintictesting.R;

public class regUsuarioContrasena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_usuario_contrasena);

        Button bCrearPerfil = findViewById(R.id.bCreaTuPerfil);

        bCrearPerfil.setOnClickListener(v -> {
            
            Intent intent = new Intent(regUsuarioContrasena.this, regInfoPersonal.class);
            Explode explode = new Explode();
            explode.setDuration(1000);

            getWindow().setExitTransition(explode);
            getWindow().setReturnTransition(new Fade());
            startActivity(intent);
        });
    }
}