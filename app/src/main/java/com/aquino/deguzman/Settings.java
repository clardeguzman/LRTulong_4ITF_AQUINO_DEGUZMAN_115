package com.aquino.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Settings extends AppCompatActivity {
    private Button buttonAbout;
    private Button buttonAdjust;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        buttonAbout = (Button) findViewById(R.id.button_about);
        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAbout();
            }
        });

        buttonAdjust = (Button) findViewById(R.id.button_adjust);
        buttonAdjust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAdjust();
            }
        });
    }

    public void openActivityAbout() {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void openActivityAdjust() {
        Intent intent = new Intent(this, adjustprice.class);
        startActivity(intent);
    }
}
