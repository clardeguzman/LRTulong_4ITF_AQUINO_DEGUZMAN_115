package com.aquino.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Landmarks extends AppCompatActivity{
    private Button buttonNorthAve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmarks);

        buttonNorthAve = (Button) findViewById(R.id.button_north);
        buttonNorthAve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityNorthAve();
            }
        });
    }

    public void openActivityNorthAve() {
        Intent intent = new Intent(this, Northave.class);
        startActivity(intent);
    }
}
