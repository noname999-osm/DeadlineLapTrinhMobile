package com.namhoan.deadlinelaptrinhmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SupportActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);
        //fb
        button  = (Button)findViewById(R.id.btnhotroFB);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/namhoannnnn"));
                startActivity(i2);
            }
        });

        //zalo
        button  = (Button)findViewById(R.id.btnhotroZalo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://chat.zalo.me"));
                startActivity(i2);
            }
        });

        //gmail
        button  = (Button)findViewById(R.id.btnhotroGmail);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com"));
                startActivity(i2);
            }
        });

    }

}
