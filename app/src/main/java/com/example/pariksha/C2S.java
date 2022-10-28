package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C2S extends AppCompatActivity {

    private Button c2s1;
    private Button c2s2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2_s);

        c2s1=findViewById(R.id.C2S1);
        c2s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C2S.this, C2S1M.class);
                startActivity(intent);
            }
        });

        c2s2=findViewById(R.id.C2S2);
        c2s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C2S.this, C2S2M.class);
                startActivity(intent);
            }
        });
    }
}

