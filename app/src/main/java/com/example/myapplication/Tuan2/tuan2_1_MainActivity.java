package com.example.myapplication.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class tuan2_1_MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_main);
        txt1=findViewById(R.id.tuan2_1_txt1);
        txt2=findViewById(R.id.tuan2_1_txt2);
        btn1=findViewById(R.id.btn_2_1);
        //Sự kiện khi ấn button

        btn1.setOnClickListener(V->{
            //định hướng di chuyển
            Intent i=new Intent(tuan2_1_MainActivity.this,tuan2_1_second_MainActivity.class);
            i.putExtra("so1",txt1.getText().toString());
            i.putExtra("so2",txt2.getText().toString());
            startActivity(i);

        });
    }
}