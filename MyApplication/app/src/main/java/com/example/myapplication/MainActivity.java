package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, View.OnLongClickListener {
    //Declaracion del xml
    Button button1;
    Button button2;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* override
        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);*/

            //REcuperar objetos del xml
            button1 = (Button) this.findViewById (R.id.id_button1);
            button1.setOnClickListener(this);



            button2 = (Button) this.findViewById (R.id.id_button2);
            button2.setOnLongClickListener(this);

            //Tratar evento
            //Evento: onCLick
            //Listener: onClickListener
        }
    //Todo responder al evento
    @Override
    public void onClick(View view) {
        Toast.makeText( this, "HELLO WORLD SHORT",Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onLongClick(View view) {
        Toast.makeText( this, "HELLO WORLD LONG",Toast.LENGTH_SHORT).show();
        return false;
    }
   /* public void onLongClick(View view) {
        Toast.makeText( this, "HELLO WORLD",Toast.LENGTH_SHORT).show();
    }*/

    }
