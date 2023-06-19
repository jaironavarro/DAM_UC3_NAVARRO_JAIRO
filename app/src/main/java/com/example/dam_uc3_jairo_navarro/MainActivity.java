package com.example.dam_uc3_jairo_navarro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_registros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_registros = findViewById(R.id.btn_registro);
        btn_registros.setOnClickListener(this::onClick);

    }
    public void onClick(View v) {
        if(v.getId()==R.id.btn_registro){
            Toast.makeText(this, "Se envio sus datos", Toast.LENGTH_SHORT).show();
        }




    }
}