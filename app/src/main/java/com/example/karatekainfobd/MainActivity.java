package com.example.karatekainfobd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button view=(Button) findViewById(R.id.view);
        view.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent=new Intent(getApplicationContext(), ViewOptions.class);
                startActivity(intent);

            }

        });

        Button insert=(Button) findViewById(R.id.insert);
        insert.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent intent=new Intent(getApplicationContext(), InsertOptions.class);
                startActivity(intent);

            }

        });

    }
}
