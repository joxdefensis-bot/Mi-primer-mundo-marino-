package com.example.mimundomarino;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaMarina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_marina);

        Button botonZarpar = findViewById(R.id.botonZarpar);
        botonZarpar.setOnClickListener(v ->
                Toast.makeText(this, R.string.mensaje_zarpar, Toast.LENGTH_SHORT).show());
    }
}
