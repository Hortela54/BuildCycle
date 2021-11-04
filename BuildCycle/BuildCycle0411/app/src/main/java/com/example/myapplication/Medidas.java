package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Medidas extends AppCompatActivity {
    EditText esterno;
    EditText cavalo;
    EditText braco;
    double quadroMTB;
    double quadroSpeed;
    double selim;
    double topMesa;
    int e;
    int b;
    int c;
    String terreno;
    Modalidade m = new Modalidade();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medidas);
        getSupportActionBar().hide();
        esterno = findViewById(R.id.esterno1);
        cavalo = findViewById(R.id.cavalo1);
        braco = findViewById(R.id.braco1);

    }

    public void CalculoMTB() {
        terreno = m.getTerreno();
        if (terreno == "estrada de chão" || terreno == "misto") {
            quadroMTB = (c * 0.67 - 10) * 0.393700787;
        } else {
            quadroSpeed = c * 0.67;
        }
    }

    public void CalculoSpeed() {
        quadroSpeed = c * 0.67;
    }

    public void selim() {
        selim = c * 0.883;
    }

    public void topMesa() {
        topMesa = ((e - c + b) / 2) + 4;
    }
    public void telaRelatorio(View view){
        Intent i = new Intent(Medidas.this, Relatorio.class);
        startActivity(i);

/*
        e = Integer.parseInt(esterno.getText().toString());
        b = Integer.parseInt(braco.getText().toString());
        c = Integer.parseInt(cavalo.getText().toString());

        Componentes.quadroMTB = quadroMTB;
        Componentes.quadroSpeed = quadroSpeed;
        Componentes.selim = selim;
        Componentes.topMesa = topMesa;
*/
    }
}


