package com.example.startingnewactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ChildActivity extends AppCompatActivity {

    private TextView mDisplayTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mDisplayTv = findViewById(R.id.tv_display);

        Intent intent = getIntent();
        if(intent.hasExtra("data")) {
            String data = intent.getStringExtra("data");
            mDisplayTv.setText(data);
        } else {
            Toast.makeText(this, "Oops no data passed to child!", Toast.LENGTH_LONG).show();
        }
    }
}