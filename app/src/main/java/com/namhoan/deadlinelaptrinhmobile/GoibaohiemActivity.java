package com.namhoan.deadlinelaptrinhmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoibaohiemActivity extends AppCompatActivity {

    private SQLiteDatabase db;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goibaohiem);

        //Sqlite
        InitData();



















        //button1
        button = (Button) findViewById(R.id.btnGoi1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GoibaohiemActivity.this, Goi1.class);
                startActivity(i);
            }
        });

        //button2
        button = (Button) findViewById(R.id.btnGoi2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GoibaohiemActivity.this, Goi2.class);
                startActivity(i);
            }
        });

        //button3
        button = (Button) findViewById(R.id.btnGoi3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GoibaohiemActivity.this, Goi3.class);
                startActivity(i);
            }
        });
    }


    //Tao bang
    private void InitData()
    {
       // db = openOrCreateDatabase("SANPHAM111.sqlite", MODE_PRIVATE, null);

       // String sql = "CREATE TABLE IF NOT EXISTS SANPHAM1 (MaSP INTEGER DEFAULT 'SP', TenSP INTEGER NOT NULL, ThoiHanDongPhi DATE ,ThoiHanHopDong\tDATE, PRIMARY KEY(\"TenSP\"))";
      //  db.execSQL(sql);

    }
        }