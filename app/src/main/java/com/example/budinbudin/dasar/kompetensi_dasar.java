package com.example.budinbudin.dasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.budinbudin.R;
import com.example.budinbudin.home_screen;

public class kompetensi_dasar extends AppCompatActivity {

    private Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kompetensi_dasar);

        button_back = findViewById(R.id.back_button);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kompetensi_dasar.this, home_screen.class));
            }
        });
    }
}
