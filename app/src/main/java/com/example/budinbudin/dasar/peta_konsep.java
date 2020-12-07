package com.example.budinbudin.dasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.budinbudin.R;
import com.example.budinbudin.home_screen;

public class peta_konsep extends AppCompatActivity {

    private Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peta_konsep);

        button_back = findViewById(R.id.back_button);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(peta_konsep.this, home_screen.class));
            }
        });
    }
}
