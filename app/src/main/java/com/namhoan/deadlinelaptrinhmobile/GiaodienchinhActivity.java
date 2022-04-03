package com.namhoan.deadlinelaptrinhmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class GiaodienchinhActivity extends AppCompatActivity {

Button button;
    @Override
    public void onCreate(Bundle  savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_giaodienchinh);


        //support
        button = (Button) findViewById(R.id.textviewa3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GiaodienchinhActivity.this, SupportActivity.class);
                startActivity(i);
            }
        });

        //Baohiem
        button = (Button) findViewById(R.id.textviewa1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(GiaodienchinhActivity.this, GoibaohiemActivity.class);
                startActivity(i2);
            }
        });

        //Tra cuu
        button = (Button) findViewById(R.id.textviewa2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GiaodienchinhActivity.this, TraCuuActivity.class);
                startActivity(i);

            }
        });



    }

}