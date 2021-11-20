package com.example.mintictesting;


import android.content.Intent;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Slide;
import android.view.Gravity;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mintictesting.deportes.DeportesRV;
import com.example.mintictesting.registro.regUsuarioContrasena;
import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button bLogin = findViewById(R.id.bLoginV);
        Button bRegistro = findViewById(R.id.bRegistroV);
        TextInputEditText Usuario = findViewById(R.id.etUsuario);
        TextInputEditText Password = findViewById(R.id.etContraseña);


        bLogin.setOnClickListener(v -> {
            intent = new Intent(Login.this, DeportesRV.class);
            startActivity(intent);
        });

        bRegistro.setOnClickListener(v -> {
            intent = new Intent(Login.this, regUsuarioContrasena.class);

            Explode explode = new Explode();
            explode.setDuration(1500);
            Slide slide = new Slide(Gravity.BOTTOM);
            slide.setDuration(1500);
            getWindow().setExitTransition(slide);
            getWindow().setReturnTransition(slide);

            startActivity(intent);
        });


    }
}