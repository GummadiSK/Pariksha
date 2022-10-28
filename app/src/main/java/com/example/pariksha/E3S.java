package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class E3S extends AppCompatActivity {

    private Button e3s1;
    private Button e3s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e3_s);
        e3s1=findViewById(R.id.E3S1);
        e3s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E3S.this, E3S1M.class);
                startActivity(intent);
            }
        });

        e3s2=findViewById(R.id.E3S2);
        e3s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(E3S.this, E3S2M.class);
                startActivity(intent);
            }
        });
    }
}