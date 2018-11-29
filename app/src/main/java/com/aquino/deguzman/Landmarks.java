package com.aquino.deguzman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Landmarks extends AppCompatActivity{
    private Button buttonNorthAve, buttonRoosevelt, buttonBalintawak, buttonMonumento, buttonFifth, buttonRpapa, buttonAbad;

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

        buttonRoosevelt = (Button) findViewById(R.id.button_roosevelt);
        buttonRoosevelt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRoosevelt();
            }
        });

        buttonBalintawak = (Button) findViewById(R.id.button_balintawak);
        buttonBalintawak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBalintawak();
            }
        });

        buttonMonumento = (Button) findViewById(R.id.button_monumento);
        buttonMonumento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMonumento();
            }
        });

        buttonFifth = (Button) findViewById(R.id.button_fifth);
        buttonFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityFifth();
            }
        });

        buttonRpapa = (Button) findViewById(R.id.button_rpapa);
        buttonRpapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRpapa();
            }
        });

        buttonAbad = (Button) findViewById(R.id.button_abad);
        buttonAbad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAbadSantos();
            }
        });
    }


    public void openActivityNorthAve() {
        Intent intent = new Intent(this, Northave.class);
        startActivity(intent);
    }

    public void openActivityRoosevelt() {
        Intent intent = new Intent(this, Roosevelt.class);
        startActivity(intent);
    }

    public void openActivityBalintawak() {
        Intent intent = new Intent(this, Balintawak.class);
        startActivity(intent);
    }

    public void openActivityMonumento() {
        Intent intent = new Intent(this, Monumento.class);
        startActivity(intent);
    }

    public void openActivityFifth() {
        Intent intent = new Intent(this, Fifthave.class);
        startActivity(intent);
    }

    public void openActivityRpapa() {
        Intent intent = new Intent(this, Rpapa.class);
        startActivity(intent);
    }

    public void openActivityAbadSantos() {
        Intent intent = new Intent(this, AbadSantos.class);
        startActivity(intent);
    }
}
