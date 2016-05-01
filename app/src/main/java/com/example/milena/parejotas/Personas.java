package com.example.milena.parejotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Personas extends AppCompatActivity {


    public void opcion1(View View){
        Intent i = new Intent(this, com.example.milena.parejotas.DescripcionYurani.class);
        startActivity(i);

    }

    public void opcion2(View View){
        Intent i = new Intent(this, com.example.milena.parejotas.DescripcionHeduardo.class);
        startActivity(i);

    }

    public void opcion3 (View View){
        Intent i = new Intent(this, com.example.milena.parejotas.DescripcionPedro.class);
        startActivity(i);

    }

    public void opcion4(View View){
        Intent i = new Intent(this, com.example.milena.parejotas.DescripcionJacobo.class);
        startActivity(i);

    }

    public void opcion5(View View){
        Intent i = new Intent(this, com.example.milena.parejotas.DescripcionMaricela.class);
        startActivity(i);

    }

    public void opcion6(View View){
        Intent i = new Intent(this, com.example.milena.parejotas.DescripcionNhatalia.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personas);
    }
}
