package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C1S extends AppCompatActivity {

    private Button c1s1;
    private Button c1s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1_s);

        c1s1=findViewById(R.id.C1S1);
        c1s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C1S.this, C1S1M.class);
                startActivity(intent);
            }
        });

        c1s2=findViewById(R.id.C1S2);
        c1s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(C1S.this, C1S2M.class);
                startActivity(intent);
            }
        });
    }
}