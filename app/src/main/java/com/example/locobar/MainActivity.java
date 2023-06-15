package com.example.locobar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void button(View view){

        Log.i("info","Button pressed! 1");
    }

    public void button2(View view){

        Log.i("info","Button pressed! 1");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}