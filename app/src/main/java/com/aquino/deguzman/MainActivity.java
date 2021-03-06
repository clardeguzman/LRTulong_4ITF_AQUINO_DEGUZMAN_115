package com.aquino.deguzman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout button, buttonSettings, buttonMap, buttonRemind, buttonLandmarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (LinearLayout) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        buttonSettings = (LinearLayout) findViewById(R.id.button5);
        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySettings();
            }
        });

        buttonMap = (LinearLayout) findViewById(R.id.button3);
        buttonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMap();
            }
        });

        buttonRemind = (LinearLayout) findViewById(R.id.button4);
        buttonRemind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityReminders();
            }
        });

        buttonLandmarks = (LinearLayout) findViewById(R.id.button2);
        buttonLandmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLandmarks();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Pricecheck.class);
        startActivity(intent);
    }

    public void openActivitySettings() {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void openActivityMap() {
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }

    public void openActivityReminders() {
        Intent intent = new Intent(this, Reminders.class);
        startActivity(intent);
    }

    public void openActivityLandmarks() {
        Intent intent = new Intent(this, Landmarks.class);
        startActivity(intent);
    }
}
