package com.notoverflow.a2nddegre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i ("tttt", "ok1");
        super.onCreate(savedInstanceState);
        Log.i ("tttt", "ok1");
        setContentView(R.layout.activity_main);

        Log.i ("tttt", "ok1");


        Button button = findViewById(R.id.button);       // associe le bouton dans java avec le bouton XML


        button.setOnClickListener(new View.OnClickListener() {      // procédure exuter sur le click
            @Override
            public void onClick(View v) {


                Intent activitysuivante = new Intent(getApplicationContext(),choix.class );

                startActivity(activitysuivante);


            }
        });




    }




}