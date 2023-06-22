package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Editar extends AppCompatActivity implements View.OnClickListener{
    EditText ediUser,ediPass,ediNombre,ediApellido;
    Button btnActualizar,btnCancelar;
    int id=0;

    Intent x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editar);
        ediUser=(EditText) findViewById(R.id.EdiUser);
        ediPass=(EditText) findViewById(R.id.EdiPass);
        ediNombre=(EditText) findViewById(R.id.EdiNombre);
        ediApellido=(EditText) findViewById(R.id.EdiApellido);
        btnActualizar=(Button) findViewById(R.id.btnEdiActualizar);
        btnCancelar=(Button) findViewById(R.id.btnEdiCancelar);

    }

    @Override
    public void onClick(View view) {

    }
}