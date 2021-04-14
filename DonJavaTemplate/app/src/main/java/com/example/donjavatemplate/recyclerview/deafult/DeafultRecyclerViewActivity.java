package com.example.donjavatemplate.recyclerview.deafult;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import com.example.donjavatemplate.R;
import com.example.donjavatemplate.recyclerview.RecyclerViewBase;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DeafultRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView rv_deafult;

    private DeafultRecyclerViewAdapter mDeafultRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_recyclerview);

        rv_deafult = findViewById(R.id.rv_deafult);

        LinearLayoutManager manager = new LinearLayoutManager(DeafultRecyclerViewActivity.this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rv_deafult.setLayoutManager(manager);

        ArrayList<String> mItems = new ArrayList<String>();
        mItems.add("아이템1");
        mItems.add("아이템2");
        mItems.add("아이템3");
        mItems.add("아이템4");
        mItems.add("아이템5");
        mItems.add("아이템6");
        mItems.add("아이템7");
        mItems.add("아이템8");
        mItems.add("아이템9");
        mItems.add("아이템10");

        mDeafultRecyclerViewAdapter = new DeafultRecyclerViewAdapter(DeafultRecyclerViewActivity.this);
        mDeafultRecyclerViewAdapter.setData(mItems);

        rv_deafult.setAdapter(mDeafultRecyclerViewAdapter);

    }
}
