package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C3S extends AppCompatActivity {

    private Button c3s1;
    private Button c3s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3_s);

        c3s1=findViewById(R.id.C3S1);
        c3s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C3S.this, C3S1M.class);
                startActivity(intent);
            }
        });

        c3s2=findViewById(R.id.C3S2);
        c3s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C3S.this, C3S2M.class);
                startActivity(intent);
            }
        });
    }
}