package com.example.hp.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class third extends AppCompatActivity {
    Button bn;
    TextView txn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        bn=findViewById(R.id.button);
        txn=findViewById(R.id.text);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent obj3=new Intent(getApplicationContext(),welcome.class);
                startActivity(obj3);
            }


    });
        txn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(third.this,"forget password",Toast.LENGTH_LONG).show();
            }
        }));
}}
