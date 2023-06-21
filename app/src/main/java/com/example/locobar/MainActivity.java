package com.example.locobar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(view -> openActivity2());

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(view -> openActivity3());

    }

    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent2 = new Intent(this, MainActivity3.class);
        startActivity(intent2);
    }

}