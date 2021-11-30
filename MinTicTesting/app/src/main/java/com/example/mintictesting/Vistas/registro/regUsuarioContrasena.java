package com.example.mintictesting.Vistas.registro;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mintictesting.R;
import com.google.android.material.textfield.TextInputEditText;

public class regUsuarioContrasena extends AppCompatActivity {

    private TextInputEditText tiCorreo, tiContraseña, tiConfContraseña;
    private Button bCrearPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_usuario_contrasena);

        tiCorreo = findViewById(R.id.ti_Correo);
        tiContraseña = findViewById(R.id.ti_Contraseña);
        tiConfContraseña = findViewById(R.id.ti_ConfContraseña);
        bCrearPerfil = findViewById(R.id.bCreaTuPerfil);

        bCrearPerfil.setEnabled(true);
        bCrearPerfil.setOnClickListener(v -> {

            nextActivity(regInfoPersonal.class);

        });
    }

    private void nextActivity(Class clase) {

        Intent intent = new Intent(regUsuarioContrasena.this, clase);
        //getWindow().setExitTransition(new Explode());
        startActivity(intent);
    }
}