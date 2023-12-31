package com.example.myapplication.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan1_MainActivity extends AppCompatActivity {
    //khai báo các control
    EditText txt1,txt2;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan1_main);
        //ánh xạ các control
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        tv=findViewById(R.id.txt3);
        btn=findViewById(R.id.btn);
        //xử lý sự kiện
        btn.setOnClickListener(V->{
            tinhTong();
        });


    }
    //định nghĩa hàm tính tổng
    private void tinhTong(){
        //lấy dữ liệu nhập vào từ ô edittext1
        String str1=txt1.getText().toString();
        //chuyển dữ liệu sang số
        float so1=Float.parseFloat(str1);
        String str2=txt2.getText().toString();
        //chuyển dữ liệu sang số
        float so2=Float.parseFloat(str2);
        float tong=so1+so2;
        tv.setText(String.valueOf(tong));
    }
}