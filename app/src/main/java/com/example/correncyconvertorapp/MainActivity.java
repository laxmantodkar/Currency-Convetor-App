package com.example.correncyconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(View->{

            EditText amount=findViewById(R.id.amount);
         int intAmount=Integer.parseInt(amount.getText().toString())*82;
            Toast.makeText(this,"AMOUNT IN INDIAN CURRENCY "+intAmount+ " RS",Toast.LENGTH_SHORT).show();
        });
    }
}