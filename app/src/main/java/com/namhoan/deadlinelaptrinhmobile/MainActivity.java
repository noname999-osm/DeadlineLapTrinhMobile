package com.namhoan.deadlinelaptrinhmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button)findViewById(R.id.btndangky);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this, DangKyActivity.class);
                startActivity(i1);
            }
        });
        //btnfacebook
        button  = (Button)findViewById(R.id.btnfacebook);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/namhoannnnn"));
                startActivity(i2);
            }
        });

        //btndangnhap
        button = (Button) findViewById(R.id.btndangnhap);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, GiaodienchinhActivity.class);
                startActivity(i);
            }
        });
    }
}