package com.triana.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSeno;
    Button btnCoseno;
    Button btnRaiz;
    Button btnPerimetro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSeno = findViewById(R.id.btnseno);
        btnCoseno = findViewById(R.id.btncoseno);
        btnRaiz = findViewById(R.id.btnraiz);
        btnPerimetro = findViewById(R.id.btnperimetro);

        btnSeno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SenoActivity.class);
                startActivity(intent);
            }
        });
        btnCoseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CosenoActivity.class);
                startActivity(intent);
            }
        });
        btnRaiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RaizActivity.class);
                startActivity(intent);
            }
        });
        btnPerimetro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PerimetroActivity.class);
                startActivity(intent);
            }
        });
    }
}
