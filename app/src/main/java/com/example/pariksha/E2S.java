package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class E2S extends AppCompatActivity {

    private Button e2s1;
    private Button e2s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e2_s);
        e2s1=findViewById(R.id.E2S1);
        e2s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E2S.this, E2S1M.class);
                startActivity(intent);
            }
        });

        e2s2=findViewById(R.id.E2S2);
        e2s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E2S.this, E2S2M.class);
                startActivity(intent);
            }
        });
    }
}