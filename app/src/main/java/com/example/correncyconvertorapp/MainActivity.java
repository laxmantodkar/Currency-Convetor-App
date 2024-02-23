package com.example.correncyconvertorapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(View->{

            EditText amount=findViewById(R.id.amount);
            int intAmount=Integer.parseInt(amount.getText().toString())*82;
            AlertDialog.Builder alert=new AlertDialog.Builder(this);
            alert.setTitle("Ammount Converted");
            alert.setMessage("Do you want to convert the amount");
            alert.setPositiveButton("YES", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            alert.show();

        });
    }
}