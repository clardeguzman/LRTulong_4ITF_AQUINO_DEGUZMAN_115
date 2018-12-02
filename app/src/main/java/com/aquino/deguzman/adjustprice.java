package com.aquino.deguzman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class adjustprice extends AppCompatActivity {

    TextView showValue;
    int counter = 0;
    Button toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjustprice);

        showValue = (TextView) findViewById(R.id.counterValue);

        toast = (Button) findViewById(R.id.button_adjustprice);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(adjustprice.this,"Price Adjusted",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void countIN (View view) {
        counter++;
        showValue.setText(Integer.toString(counter));
    }

    public void countDE (View v) {
        counter--;
        showValue.setText(Integer.toString(counter));
    }

    public void resetCount (View v) {
        counter = 0;
        showValue.setText(String.valueOf(counter));
    }
}
