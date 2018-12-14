package com.aquino.deguzman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class adjustprice extends AppCompatActivity {

    TextView showValue;
    int counter = 0;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjustprice);

        showValue = (TextView) findViewById(R.id.counterValue);
        btn = (Button) findViewById(R.id.button_adjustprice);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(adjustprice.this,"Price Adjusted",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(adjustprice.this, Pricecheck.class);
                intent.putExtra("ADJUSTED_PRICE", counter);
                startActivity(intent);
                
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

}
