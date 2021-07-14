package com.example.hp.intent;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class welcome extends AppCompatActivity {
TextView txn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        txn=findViewById(R.id.text);
        txn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent obj3=new Intent(getApplicationContext(),image.class);
                startActivity(obj3);
            }


        });

    }
}
