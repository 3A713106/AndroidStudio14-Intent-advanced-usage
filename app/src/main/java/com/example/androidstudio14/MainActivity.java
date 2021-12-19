package com.example.androidstudio14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view) {
        Uri uri = Uri.parse("tel:xxxxxx");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }

    public void internt(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(browserIntent);
    }

    public void  map (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.tw/maps/place/%E5%9C%8B%E7%AB%8B%E5%8B%A4%E7%9B%8A%E7%A7%91%E6%8A%80%E5%A4%A7%E5%AD%B8/@24.1455008,120.732639,17z/data=!4m5!3m4!1s0x3469235d7fb2c4a7:0x1cc856130460088d!8m2!3d24.1461861!4d120.7324566?hl=zh-TW&authuser=0"));
        startActivity(browserIntent);
    }
}