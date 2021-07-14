package com.example.hp.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class image extends AppCompatActivity {
Button txn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        txn=findViewById(R.id.button);
        txn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent obj3=new Intent(getApplicationContext(),sixth.class);
                startActivity(obj3);
            }


        });

    }
}

