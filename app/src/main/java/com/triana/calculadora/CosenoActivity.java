package com.triana.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CosenoActivity extends AppCompatActivity {
    EditText cateto_adyacente, hipotenusa;
    Button calcular_coseno;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coseno);

        EditText cateto_adyacente = findViewById(R.id.txtadyacente);
        EditText hipotenusa = findViewById(R.id.txthipotenusacoseno);
        Button calcular_coseno = findViewById(R.id.btncalcular_coseno);
        TextView resultado = findViewById(R.id.lblresultadocoseno);

        calcular_coseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String adjacentString = cateto_adyacente.getText().toString();
                String hypotenuseString = hipotenusa.getText().toString();
                if (!adjacentString.isEmpty() && !hypotenuseString.isEmpty()) {
                    double adjacent = Double.parseDouble(adjacentString);
                    double hypotenuse = Double.parseDouble(hypotenuseString);
                    double coseno = adjacent / hypotenuse;
                    resultado.setText("Coseno: " + coseno);
                } else {
                    resultado.setText("Por favor, ingresa los lados del triángulo.");
                }
            }
        });
    }
}