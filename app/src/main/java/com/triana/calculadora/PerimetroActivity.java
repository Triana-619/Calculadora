package com.triana.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerimetroActivity extends AppCompatActivity {
    EditText lado1,lado2,lado3;
    Button calcularperimetro;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro);

        EditText lado1 = findViewById(R.id.txtlado1);
        EditText lado2 = findViewById(R.id.txtlado2);
        EditText lado3 = findViewById(R.id.txtlado3);
        Button calcularperimetro = findViewById(R.id.btncalcularperimetro);
        TextView resultado = findViewById(R.id.lblresultadoperimetro);

        calcularperimetro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String side1String = lado1.getText().toString();
                String side2String = lado2.getText().toString();
                String side3String = lado3.getText().toString();
                if (!side1String.isEmpty() && !side2String.isEmpty() && !side3String.isEmpty()) {
                    double side1 = Double.parseDouble(side1String);
                    double side2 = Double.parseDouble(side2String);
                    double side3 = Double.parseDouble(side3String);
                    double perimetro = side1 + side2 + side3;
                    Intent intent = new Intent(PerimetroActivity.this, ResultadoActivity.class);
                    intent.putExtra("resultado", perimetro); // Aquí "coseno" es la clave para el extra
                    startActivity(intent);
                } else {
                    resultado.setText("Por favor, ingresa las longitudes de los tres lados del triángulo.");
                }
            }
        });
    }
}