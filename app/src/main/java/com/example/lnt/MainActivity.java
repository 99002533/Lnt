package com.example.lnt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText; //declaration

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.editTextTextPersonName); //init
    }

    public void clickHandler(View view) {
        switch (view.getId()){
            case R.id.buttonlogin:
                String name = nameEditText.getText().toString(); //using
                //Toast.makeText(this, "Welcome to Android "+name, Toast.LENGTH_SHORT).show();
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                homeIntent.putExtra("mykey",name);
                startActivity(homeIntent);
                break;
            case R.id.buttoncancel:
                Toast.makeText(this, "cancelled ", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}