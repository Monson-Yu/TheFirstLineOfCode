package com.yyg.thefirstlineofcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.yyg.thefirstlineofcode.adapter.MainTitleAdapter;

public class MainActivity extends AppCompatActivity {
    private ListView mLvmaintitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLvmaintitle = findViewById(R.id.lv_main_title);
        mLvmaintitle.setAdapter(new MainTitleAdapter(MainActivity.this));
    }
}
