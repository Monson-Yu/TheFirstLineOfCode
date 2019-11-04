package com.yyg.thefirstlineofcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private String[] data = {"开始启程——你的第一行Android代码", "先从看得到的入手——探究活动", "软件也要拼脸蛋——UI开发的点点滴滴", "手机平板要兼顾——探究碎片"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
