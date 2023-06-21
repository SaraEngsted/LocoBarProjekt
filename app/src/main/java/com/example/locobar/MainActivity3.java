package com.example.locobar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button = (Button) findViewById(R.id.buttonAdd);
        button.setOnClickListener(view -> openActivity2());

        button2 = (Button) findViewById(R.id.tilbage1);
        button2.setOnClickListener(view -> openActivity());

    }

    public void saveInfo (View view){

    }

    public void openActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openActivity2() {
        Intent intent2 = new Intent(this, MainActivity3.class);
        startActivity(intent2);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}