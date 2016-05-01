package com.example.milena.parejotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void click(View View){
        Intent i = new Intent(this, com.example.milena.parejotas.Personas.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
