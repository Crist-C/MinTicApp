package com.example.mintictesting;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mintictesting.Helpers.NextActivity;
import com.example.mintictesting.Vistas.deportes.DeportesRV;
import com.example.mintictesting.Vistas.registro.regUsuarioContrasena;
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
            new NextActivity(this, DeportesRV.class).goToNextActivity();
        });

        bRegistro.setOnClickListener(v -> {

            new NextActivity( this, regUsuarioContrasena.class).goToNextActivity();


        });


    }
}