package com.example.locobar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    private GridViewAdapter adapter;
    private final FirebaseService firebaseService = new FirebaseService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        GridView gridView = findViewById(R.id.gridView);
        adapter = new GridViewAdapter(this, R.layout.grid_item, new ArrayList<>());
        gridView.setAdapter(adapter);
        firebaseService.getAllItems(adapter);
    }

    public void back(View view) {
        finish();
    }
}
