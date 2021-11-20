package com.example.mintictesting.registro;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mintictesting.R;

public class regInfoPersonal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_info_personal);

        Button bRegInfPersonal = findViewById(R.id.bRegInfPersonalV);

        bRegInfPersonal.setOnClickListener(v -> {
            Intent intent = new Intent(regInfoPersonal.this, regEstadoFisico.class);

            Fade fade = new Fade();
            fade.setDuration(1000);
            getWindow().setExitTransition(fade);
            getWindow().setReturnTransition(fade);
            startActivity(intent);

        });
    }
}