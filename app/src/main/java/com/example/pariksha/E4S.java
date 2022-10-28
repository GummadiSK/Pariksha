package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class E4S extends AppCompatActivity {

    private Button e4s1;
    private Button e4s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e4_s);

        e4s1=findViewById(R.id.E4S1);
        e4s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E4S.this, E4S1M.class);
                startActivity(intent);
            }
        });

        e4s2=findViewById(R.id.E4S2);
        e4s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E4S.this, E4S2M.class);
                startActivity(intent);
            }
        });
    }
}