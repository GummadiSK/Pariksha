package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CSE extends AppCompatActivity {
    private Button c1;
    private Button c2;
    private Button c3;
    private Button c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);

        c1=findViewById(R.id.C1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CSE.this, C1S.class);
                startActivity(intent);
            }
        });

        c2=findViewById(R.id.C2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CSE.this, C2S.class);
                startActivity(intent);
            }
        });

        c3=findViewById(R.id.C3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CSE.this, C3S.class);
                startActivity(intent);
            }
        });

        c4=findViewById(R.id.C4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CSE.this, C4S.class);
                startActivity(intent);
            }
        });
    }

}