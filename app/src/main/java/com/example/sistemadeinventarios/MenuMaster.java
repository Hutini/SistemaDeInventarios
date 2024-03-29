package com.example.sistemadeinventarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuMaster extends AppCompatActivity {

    Button ingresoMaterial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_master);

        ingresoMaterial = (Button) findViewById(R.id.ingresoMaterial);

        ingresoMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), IngresoMaterial.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
