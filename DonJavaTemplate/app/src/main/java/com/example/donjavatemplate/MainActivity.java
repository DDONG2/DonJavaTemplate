package com.example.donjavatemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.donjavatemplate.recyclerview.RecyclerViewBase;
import com.example.donjavatemplate.utils.GsonDTO;
import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button button_Main_1;

    private ArrayList<GsonDTO.Price> priceList = new ArrayList<GsonDTO.Price>();

    private ArrayList<GsonDTO.Price> selectPriceList = new ArrayList<GsonDTO.Price>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                String a = "{\"ret_code\":\"1000\",\"ret_msg\":\"처리 결과 응답 메시지\"" +
                ",\"data\":{\"noti_seq\":\"1\",\"noti_title\":\"공지사항 제목\",\"ver\":\"1000\",\"ctn_count\":2,\"service_count\":2" +
                ",\"price\":[{\"ctn\":\"20대\",\"seq\":\"2\",\"url\":\"여자\",\"pic_default\":\"심플\",\"list_count\":0}" +
                ",{\"ctn\":\"10대\",\"seq\":\"1\",\"url\":\"남자\",\"pic_default\":\"심플\",\"list_count\":0}" +
                ",{\"ctn\":\"20대\",\"seq\":\"2\",\"url\":\"남자\",\"pic_default\":\"모던\",\"list_count\":0}" +
                ",{\"ctn\":\"20대\",\"seq\":\"3\",\"url\":\"여자\",\"pic_default\":\"유니크\",\"list_count\":0}" +
                ",{\"ctn\":\"30대\",\"seq\":\"4\",\"url\":\"여자\",\"pic_default\":\"유니크\",\"list_count\":0}" +
                ",{\"ctn\":\"10대\",\"seq\":\"5\",\"url\":\"남자\",\"pic_default\":\"모던\",\"list_count\":0}" +
                ",{\"ctn\":\"20대\",\"seq\":\"6\",\"url\":\"여자\",\"pic_default\":\"유니크\",\"list_count\":0}" +
                ",{\"ctn\":\"10대\",\"seq\":\"7\",\"url\":\"여자\",\"pic_default\":\"심플\",\"list_count\":0}" +
                ",{\"ctn\":\"40대\",\"seq\":\"8\",\"url\":\"여자\",\"pic_default\":\"유니크\",\"list_count\":0}" +
                ",{\"ctn\":\"10대\",\"seq\":\"9\",\"url\":\"여자\",\"pic_default\":\"모던\",\"list_count\":0}" +
                ",{\"ctn\":\"30대\",\"seq\":\"10\",\"url\":\"여자\",\"pic_default\":\"0\",\"list_count\":0}" +
                ",{\"ctn\":\"20대\",\"seq\":\"11\",\"url\":\"여자\",\"pic_default\":\"유니크\",\"list_count\":0}" +
                ",{\"ctn\":\"10대\",\"seq\":\"12\",\"url\":\"여자\",\"pic_default\":\"심플\",\"list_count\":0}" +
                ",{\"ctn\":\"20대\",\"seq\":\"13\",\"url\":\"여자\",\"pic_default\":\"심플\",\"list_count\":0}]}" +
                ",\"token\":\"\"}";
        Gson gson = new Gson();
        final GsonDTO price = gson.fromJson(a, GsonDTO.class);

        for(int i= 0; i < price.getData().getPrice().size(); i++){
            priceList.add(price.getData().getPrice().get(i));
        }

        for(int i= 0; i < priceList.size(); i++){
            if(priceList.get(i).getCtn().equalsIgnoreCase("10대"))
            {
                selectPriceList.add(priceList.get(i));
            }
        }




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