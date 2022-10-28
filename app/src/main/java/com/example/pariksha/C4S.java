package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C4S extends AppCompatActivity {

    private Button c4s1;
    private Button c4s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c4_s);
        c4s1=findViewById(R.id.C4S1);
        c4s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C4S.this, C4S1M.class);
                startActivity(intent);
            }
        });

        c4s2=findViewById(R.id.C4S2);
        c4s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C4S.this, C4S2M.class);
                startActivity(intent);
            }
        });
    }
}