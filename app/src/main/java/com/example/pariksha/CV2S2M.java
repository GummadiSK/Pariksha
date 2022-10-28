package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CV2S2M extends AppCompatActivity {
    private Button cv2s2m1;
    private Button cv2s2m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv2_s2_m);
        cv2s2m1=findViewById(R.id.CV2S2M1);
        cv2s2m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV2S2M.this, CV2S2M1.class);
                startActivity(intent);
            }
        });

        cv2s2m2=findViewById(R.id.CV2S2M2);
        cv2s2m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV2S2M.this, CV2S2M2.class);
                startActivity(intent);
            }
        });
    }
}