package com.triana.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CosenoActivity extends AppCompatActivity {
    EditText angulocoseno;
    Button calcular_coseno;
    TextView resultado;

    RadioButton radioGrados;
    RadioButton radioRadianes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coseno);

        angulocoseno = findViewById(R.id.txtangulocoseno);
        calcular_coseno = findViewById(R.id.btncalcular_coseno);
        resultado = findViewById(R.id.lblresultadocoseno);
        radioGrados = findViewById(R.id.gradoscoseno);
        radioRadianes = findViewById(R.id.radianescoseno);

        calcular_coseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String anguloString = angulocoseno.getText().toString();
                if (!anguloString.isEmpty()) {
                    double angulo = Double.parseDouble(anguloString);
                    double radianes = radioGrados.isChecked() ? Math.toRadians(angulo) : angulo;
                    double coseno = Math.cos(radianes);
                    Intent intent = new Intent(CosenoActivity.this, ResultadoActivity.class);
                    intent.putExtra("coseno", coseno); // Aquí "coseno" es la clave para el extra
                    startActivity(intent);
                } else {
                    resultado.setText("Por favor, ingresa un ángulo.");
                }
            }
        });
    }
}

