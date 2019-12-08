package com.example.sistemadeinventarios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IngresoMaterial extends AppCompatActivity {

    EditText cantidad;
    EditText lugar;
    EditText codigo;
    EditText funcionario;
    Button registarSalida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_material);

        cantidad =(EditText)  findViewById(R.id.cantidad);
        lugar =(EditText)  findViewById(R.id.lugar);
        codigo =(EditText)  findViewById(R.id.codigo);
        funcionario =(EditText)  findViewById(R.id.funcionario);
        registarSalida =(Button)findViewById(R.id.registrarSalida);


        registarSalida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
