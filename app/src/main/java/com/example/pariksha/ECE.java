package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ECE extends AppCompatActivity {

    private Button e1;
    private Button e2;
    private Button e3;
    private Button e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece);

        e1=findViewById(R.id.E1);
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ECE.this, E1S.class);
                startActivity(intent);
            }
        });

        e2=findViewById(R.id.E2);
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ECE.this, E2S.class);
                startActivity(intent);
            }
        });

        e3=findViewById(R.id.E3);
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ECE.this, E3S.class);
                startActivity(intent);
            }
        });

        e4=findViewById(R.id.E4);
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ECE.this, E4S.class);
                startActivity(intent);
            }
        });
    }
}