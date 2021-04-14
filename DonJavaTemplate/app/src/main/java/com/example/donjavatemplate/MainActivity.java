package com.example.donjavatemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.donjavatemplate.recyclerview.RecyclerViewBase;

public class MainActivity extends AppCompatActivity {

    Button button_Main_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //리사이클러뷰 모음
        button_Main_1 = findViewById(R.id.button_main_1);
        button_Main_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewBase.class);
                startActivity(intent);
            }
        });


    }
}