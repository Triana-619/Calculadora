package com.triana.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SenoActivity extends AppCompatActivity {

    EditText lado_opuesto, hipotenusa;
    Button calcularseno;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seno);

        EditText lado_opuesto = findViewById(R.id.txtopuesto);
        EditText hipotenusa = findViewById(R.id.txthipotenusa);
        Button calcularseno = findViewById(R.id.btncalcularseno);
        TextView resultado = findViewById(R.id.lblresultado);

        calcularseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String oppositeString = lado_opuesto.getText().toString();
                String hypotenuseString = hipotenusa.getText().toString();
                if (!oppositeString.isEmpty() && !hypotenuseString.isEmpty()) {
                    double opposite = Double.parseDouble(oppositeString);
                    double hypotenuse = Double.parseDouble(hypotenuseString);
                    double seno = opposite / hypotenuse;
                    resultado.setText("Seno: " + seno);
                } else {
                    resultado.setText("Por favor, ingresa los lados del triángulo.");
                }
            }
        });

    }
}