package com.example.startingnewactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "myActivity";
    private EditText mNameEntry;
    private Button mDoSomethingCoolButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDoSomethingCoolButton = findViewById(R.id.b_do_something_cool);
        mNameEntry = findViewById(R.id.et_text_entry);

        mDoSomethingCoolButton.setOnClickListener(new View.OnClickListener() {

            /**
             * The onClick method is triggered when this button (mDoSomethingCoolButton) is clicked.
             *
             * @param view The view that is clicked. In this case, it's mDoSomethingCoolButton.
             */
            @Override
            public void onClick(View view) {
                String message = "Button clicked!\nTODO: Start a new Activity and pass some data...";
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });

    }
}