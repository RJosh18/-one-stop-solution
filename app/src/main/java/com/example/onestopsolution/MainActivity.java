package com.example.onestopsolution;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;
import android.content.Intent;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    Button button;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
//      btnFire= (Button) findViewById(R.id.btnFire);
//      btnFire.setOnClickListener(new View.OnClickListener(){
//          public void onClick(View v){
//              Intent intent=new Intent(MainActivity.this,NavAct.class);
//              startActivity(intent);
//          }
//      });

    }

    public void addListenerOnButton() {

        final Context context = this;

        button = findViewById(R.id.btnFire);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, NavAct.class);
                startActivity(intent);

            }

        });

    }
}