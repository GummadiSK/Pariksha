package com.example.pariksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CV2S extends AppCompatActivity {
    private Button cv2s1;
    private Button cv2s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv2s);

        cv2s1=findViewById(R.id.CV2S1);
        cv2s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV2S.this, CV2S1M.class);
                startActivity(intent);
            }
        });

        cv2s2=findViewById(R.id.CV2S2);
        cv2s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CV2S.this, CV2S2M.class);
                startActivity(intent);
            }
        });
    }
}