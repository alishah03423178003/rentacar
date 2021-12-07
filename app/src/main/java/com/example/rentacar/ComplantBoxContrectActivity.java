package com.example.rentacar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ComplantBoxContrectActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complant_box_contrect);

        btn = (Button) findViewById(R.id.submit_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ComplantBoxContrectActivity.this, LoginActivity.class);
                startActivity(i);
                Toast.makeText(getBaseContext(), "Complant Submitted Successfully", Toast.LENGTH_SHORT).show();
            }
        });

    }
}