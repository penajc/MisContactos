package com.jcpena.miscontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText nombre, fecha, telefono, email , descripcion;
    Button   siguiente;
    private int dia,mes,ano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /////////////////////////selector fecha//////////////////




        ///////////////////Asignación de campos a variables //////////////
        nombre      =  findViewById(R.id.EtNombre);
        fecha       =  findViewById(R.id.EtFecha);
        telefono    =  findViewById(R.id.EtCelular);
        email       =  findViewById(R.id.EtCorreo);
        descripcion =  findViewById(R.id.EtmDetalles);

        siguiente   =  findViewById(R.id.BtSiguiente);


      //////////////////
        siguiente.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String EtNombre   =  nombre.getText().toString().trim();
              String EtFecha    =  fecha.getText().toString().trim();
              String EtCelular  =  telefono.getText().toString().trim();
              String EtCorreo   =  email.getText().toString().trim();
              String EtDetalles =  descripcion.getText().toString().trim();

              if (!EtNombre.isEmpty() && !EtFecha.isEmpty() && !EtCelular.isEmpty() && !EtCorreo.isEmpty()
                      && !EtDetalles.isEmpty()){

                  Bundle extras = new Bundle();
                  extras.putString("NOMBRE",EtNombre);
                  extras.putString("FECHA",EtFecha);
                  extras.putString("CELULAR",EtCelular);
                  extras.putString("CORREO",EtCorreo);
                  extras.putString("DETALLES",EtDetalles);

                  Intent siguiente = new Intent(MainActivity.this, MainActivity2.class);

                  siguiente.putExtras(extras);

                  startActivity(siguiente);


              }else{

                  Context context   = MainActivity.this;
                  CharSequence text = "Complete Todos Los Campos";
                  int duration      = Toast.LENGTH_SHORT;
                  Toast.makeText(context, text, duration).show();

              }



          }
      });

    }
}