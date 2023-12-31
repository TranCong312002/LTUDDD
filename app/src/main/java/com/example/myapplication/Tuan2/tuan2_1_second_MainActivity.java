package com.example.myapplication.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class tuan2_1_second_MainActivity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_second_main);
        tv1=findViewById(R.id.tuan2_1tv_1);
        //don du lieu
        Intent t1=getIntent();
        //do hang
        String chuoi1=t1.getExtras().getString("so1");
        String chuoi2=t1.getExtras().getString("so2");
        Float so1=Float.parseFloat(chuoi1);
        Float so2=Float.parseFloat(chuoi2);
        Float tong=so1+so2;
        tv1.setText(String.valueOf(tong));

    }
}