package com.example.buildcycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Modalidade extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    String objetivo = "";
    String terreno = "Sem terreno";
    String distancia = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modalidade);
        getSupportActionBar().hide();
    }

    public void Radioobjetivo(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.locomocao:
                if (checked)
                    objetivo = "locomoção";
                break;
            case R.id.esporte:
                if (checked)
                    objetivo = "esporte";
                break;
            case R.id.treino:
                if (checked)
                    objetivo = "treino";
                break;
        }
    }
        public void Radiodistancia (View view){
            boolean checked = ((RadioButton) view).isChecked();
            switch (view.getId()) {
                case R.id.leve:
                    if (checked)
                        distancia = "leve";
                    break;
                case R.id.medio:
                    if (checked)
                        distancia = "medio";
                        break;
                case R.id.alto:
                    if (checked)
                        distancia = "alto";
                        break;
            }
        }

            public void Radioterreno (View view){
                boolean checked = ((RadioButton) view).isChecked();
                switch (view.getId()) {
                    case R.id.asfalto:
                        if (checked)
                            terreno = "asfalto";
                            break;
                    case R.id.estrada:
                        if (checked)
                            terreno = "estrada de chão";
                            break;
                    case R.id.misto:
                        if (checked)
                            terreno = "misto";
                            break;
                }
            }
        public String getTerreno(){
        return terreno;
    }
        }
