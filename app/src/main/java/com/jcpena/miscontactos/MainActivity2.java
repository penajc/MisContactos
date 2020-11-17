package com.jcpena.miscontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.*;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView TvNombre, TvFecha, TvTelefono, TvEmail, TvDetalles;
        Button editar;

        TvNombre   = findViewById(R.id.TvNombre);
        TvFecha    = findViewById(R.id.TvCumpleaños);
        TvTelefono = findViewById(R.id.TvTelefono);
        TvEmail    = findViewById(R.id.TvEmail);
        TvDetalles = findViewById(R.id.TvDescripcion);

        String nombre, fecha, telefono, email, descripcion;

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        nombre      = extras.getString("NOMBRE");
        fecha       = extras.getString("FECHA");
        telefono    = extras.getString("CELULAR");
        email       = extras.getString("CORREO");
        descripcion = extras.getString("DETALLES");

        TvNombre.setText(nombre);
        TvFecha.setText(fecha);
        TvTelefono.setText(telefono);
        TvEmail.setText(email);
        TvDetalles.setText(descripcion);

        editar = findViewById(R.id.BtEditar);
        editar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });











    }
}