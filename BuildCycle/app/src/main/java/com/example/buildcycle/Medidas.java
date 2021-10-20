package com.example.buildcycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.concurrent.LinkedTransferQueue;

public class Medidas extends AppCompatActivity {
    EditText altura;
    EditText cavalo;
    EditText braco;
    double quadroMTB;
    double quadroSpeed;
    double selim;
    double topMesa;
    int a = Integer.parseInt(altura.getText().toString());
    int b = Integer.parseInt(braco.getText().toString());
    int c = Integer.parseInt(cavalo.getText().toString());
    String terreno;
    Modalidade m = new Modalidade();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medidas);
        getSupportActionBar().hide();
        altura = findViewById(R.id.altura1);
        cavalo = findViewById(R.id.cavalo1);
        braco = findViewById(R.id.braco1);
    }

    public void quadroCalculo () {
        terreno = m.getTerreno();
       if(terreno == "estrada de chão" || terreno == "misto"){
        quadroMTB = (c * 0.67 - 10) * 0.393700787;
       }else {
           quadroSpeed = c * 0.67;
       }
    }

    public void selim() {
        selim = c * 0.883;
    }

    public void topMesa() {
        topMesa = ((a - c + b) / 2) + 4;
    }
}


