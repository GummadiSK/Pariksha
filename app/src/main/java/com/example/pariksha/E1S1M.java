package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class E1S1M extends AppCompatActivity {

    private Button e1s1m1;
    private Button e1s1m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e1_s1_m);
        e1s1m1=findViewById(R.id.E1S1M1);
        e1s1m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E1S1M.this, E1S1M1.class);
                startActivity(intent);
            }
        });

        e1s1m2=findViewById(R.id.E1S1M2);
        e1s1m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E1S1M.this, E1S1M2.class);
                startActivity(intent);
            }
        });
    }
}