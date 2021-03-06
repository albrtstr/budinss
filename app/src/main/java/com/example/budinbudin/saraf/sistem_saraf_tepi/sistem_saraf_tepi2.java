package com.example.budinbudin.saraf.sistem_saraf_tepi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.budinbudin.R;
import com.example.budinbudin.home_screen;
import com.example.budinbudin.saraf.impuls_saraf.impuls_saraf_gerak_refleks;
import com.example.budinbudin.saraf.sistem_saraf_menu;
import com.example.budinbudin.saraf.sistem_saraf_pusat.pons_varolii;
import com.example.budinbudin.saraf.sistem_saraf_pusat.serebelum;
import com.example.budinbudin.saraf.sistem_saraf_pusat.serebrum;

public class sistem_saraf_tepi2 extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistem_saraf_tepi2);


        Button back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_saraf_tepi2.this, sistem_saraf_menu.class));
                finish();
            }
        });

        Button home = findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sistem_saraf_tepi2.this, home_screen.class));
                finish();
            }
        });

    }
    public boolean onTouchEvent(MotionEvent touchEvent) {

        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 > x2){
                    Intent i = new Intent(sistem_saraf_tepi2.this, sistem_saraf_tepi1.class);
                    startActivity(i);
                    finish();

                }
                break;
        }
        return false;
    }
}
