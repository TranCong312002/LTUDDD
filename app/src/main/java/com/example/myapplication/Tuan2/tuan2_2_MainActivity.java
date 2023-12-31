package com.example.myapplication.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class tuan2_2_MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);
        lv=findViewById(R.id.tuan2_2Listview);
        //nguồn dữ liệu
        String[] arr=new String[]{"Mon 1","Tuần 1","Môn 2","Môn 3","Môn 4","Môn 5","Môn 6","Mon 7","Tuần 2","Môn 9","Môn 10","Môn 11","Môn 12","Môn 13","Mon 14","Tuần 3","Môn 15","Môn 16","Môn 17","Môn 18","Môn 19"};
        //adapter
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        lv.setAdapter(adapter);
    }
}