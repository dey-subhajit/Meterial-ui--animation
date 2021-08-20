package com.example.meterialdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText user_id, pwd;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_id = findViewById(R.id.user_id);
        pwd = findViewById(R.id.user_id);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = user_id.getText().toString();
                String pass = pwd.getText().toString();
                Toast.makeText(MainActivity.this, id+" "+pass, Toast.LENGTH_LONG).show();
            }
        });
    }
}