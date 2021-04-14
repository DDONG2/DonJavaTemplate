package com.example.donjavatemplate.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.donjavatemplate.R;
import com.example.donjavatemplate.recyclerview.deafult.DeafultRecyclerViewActivity;

import androidx.appcompat.app.AppCompatActivity;

public class RecyclerViewBase extends AppCompatActivity {

    Button button_Recycler_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_recyclerview);

        //기본 리사이클러뷰
        button_Recycler_1 = findViewById(R.id.button_recycler_1);
        button_Recycler_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerViewBase.this, DeafultRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

    }
}

