package com.aquino.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Reminders extends AppCompatActivity{
    private Button buttonTrain, buttonRemind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminders);

        buttonRemind = (Button) findViewById(R.id.button_remind);
        buttonRemind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRemind();
            }
        });

        buttonTrain = (Button) findViewById(R.id.button_train);
        buttonTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityTrain();
            }
        });
    }

    public void openActivityRemind() {
        Intent intent = new Intent(this, Remind.class);
        startActivity(intent);
    }

    public void openActivityTrain() {
        Intent intent = new Intent(this, Train.class);
        startActivity(intent);
    }
}

