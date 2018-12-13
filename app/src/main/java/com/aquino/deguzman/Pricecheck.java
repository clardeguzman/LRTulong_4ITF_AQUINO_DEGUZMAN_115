package com.aquino.deguzman;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Pricecheck extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    Spinner s1,s2;
    Button b1;
    TextView t1,t2;
    String state[]=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricecheck);


        s1=(Spinner)findViewById(R.id.spinner);
        s2=(Spinner)findViewById(R.id.spinner2);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);

        s1.setOnItemSelectedListener(this);

        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(this); // calling onClick() method
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position==0)
        {
            state=new String[]{"EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==1)
        {
            state=new String[]{"Baclaran", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==2)
        {
            state=new String[]{"Baclaran", "EDSA", "Gil Puyat", "Vito Cruz", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==3)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Vito Cruz", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==4)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Quirino", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==5)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Pedro Gil",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==6)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==7)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==8)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==9)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Doroteo Jose", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==10)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Bambang", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==11)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Tayuman", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==12)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Blumentritt",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==13)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==14)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "R. Papa", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==15)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "Abad Santos", "5th Ave", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==16)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "Abad Santos", "R. Papa", "Monumento", "Balintawak", "Roosevelt"};
        }
        if(position==17)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "Abad Santos", "R. Papa", "5th Ave", "Balintawak", "Roosevelt"};
        }

        if(position==18)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Roosevelt"};
        }

        if(position==19)
        {
            state=new String[]{"Baclaran", "EDSA", "Libertad", "Gil Puyat", "Vito Cruz", "Quirino",
                    "Pedro Gil", "UN Ave", "Central", "Carriedo", "Doroteo Jose", "Bambang", "Tayuman",
                    "Blumentritt", "Abad Santos", "R. Papa", "5th Ave", "Monumento", "Balintawak"};
        }


        ArrayAdapter<String> adt=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, state);
        s2.setAdapter(adt);

        t2.setText("Click any button below to check price");
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        String country = s1.getSelectedItem().toString();
        String state = s2.getSelectedItem().toString();
        ImageView im=(ImageView)findViewById(R.id.imageView2);

//        Intent mIntent = getIntent();
//        int intValue = mIntent.getIntExtra("ADJUSTED_PRICE", 0);


        switch (v.getId()) {

            case R.id.button:
                im.setImageResource(R.drawable.sjt);
                t2.setText("Single Journey Ticket Price");
                t1.setTextColor(Color.parseColor("#000000"));
                t2.setTextColor(Color.parseColor("#000000"));
                switch (country) {
                    case "Baclaran":
                        switch (state) {
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
//                                t1.setText(Integer.toString(intValue));
                                t1.setText("40");
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                                t1.setText("50");

                                break;

                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("60");

                                break;
                        }

                    case "EDSA":
                        switch (state) {
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                                t1.setText("P15");

                                break;

                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                                t1.setText("P20");

                                break;

                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Libertad":
                        switch (state) {
                            case "Baclaran":
                            case "EDSA":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Gil Puyat":
                        switch (state) {
                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Vito Cruz":
                        switch (state) {
                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Quirino":
                        switch (state) {
                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Pedro Gil":
                        switch (state) {
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "UN Ave":
                        switch (state) {
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Central":
                        switch (state) {
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Carriedo":
                        switch (state) {
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Doroteo Jose":
                        switch (state) {
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Monumento":
                            case "Balintawak":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Bambang":
                        switch (state) {
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Tayuman":
                        switch (state) {
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Blumentritt":
                        switch (state) {
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Abad Santos":
                        switch (state) {
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "R. Papa":
                        switch (state) {
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "5th Ave":
                        switch (state) {
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "Monumento":
                            case "Balintawak":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Monumento":
                        switch (state) {
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Balintawak":
                            case "Roosevelt":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Balintawak":
                        switch (state) {
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                            case "Roosevelt":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }

                    case "Roosevelt":
                        switch (state) {
                            case "Monumento":
                            case "Balintawak":
                                t1.setText("P15");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                                t1.setText("P20");
                                t2.setText("Single Journey Ticket Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                                t1.setText("P30");
                                t2.setText("Single Journey Ticket Price");
                                break;
                        }


                }
                break;

            case R.id.button2:
                im.setImageResource(R.drawable.svc);
                t1.setTextColor(Color.parseColor("#FFFFFF"));
                t2.setTextColor(Color.parseColor("#FFFFFF"));
                switch (country) {
                    case "Baclaran":
                        switch (state) {
                            case "Baclaran":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "EDSA":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Pedro Gil":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "UN Ave":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                                t1.setText("P18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Carriedo":
                            case "Doroteo Jose":
                                t1.setText("P19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Bambang":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Tayuman":
                            case "Blumentritt":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Abad Santos":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "R. Papa":
                                t1.setText("P23");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "5th Ave":
                                t1.setText("P24");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Monumento":
                                t1.setText("P25");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Balintawak":
                                t1.setText("P27");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P29");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "EDSA":
                        switch (state) {
                            case "EDSA":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "Libertad":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Gil Puyat":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                            case "Pedro Gil":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "UN Ave":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Carriedo":
                                t1.setText("P18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Doroteo Jose":
                            case "Bambang":
                                t1.setText("P19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Tayuman":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Blumentritt":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Abad Santos":
                            case "R. Papa":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "5th Ave":
                                t1.setText("P23");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Monumento":
                                t1.setText("P24");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Balintawak":
                                t1.setText("P27");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P29");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Libertad":
                        switch (state) {
                            case "Libertad":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "EDSA":
                            case "Gil Puyat":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "Vito Cruz":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                            case "Pedro Gil":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "UN Ave":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Carriedo":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Doroteo Jose":
                            case "Bambang":
                                t1.setText("P18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Tayuman":
                                t1.setText("P19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Blumentritt":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Abad Santos":
                            case "R. Papa":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "5th Ave":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Monumento":
                                t1.setText("P23");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Balintawak":
                                t1.setText("P26");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P28");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Gil Puyat":
                        switch (state) {
                            case "Gil Puyat":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                            case "Vito Cruz":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Quirino":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                            case "Carriedo":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Doroteo Jose":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;


                            case "Bambang":
                            case "Tayuman":
                                t1.setText("P18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Blumentritt":
                                t1.setText("P19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Abad Santos":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;


                            case "R. Papa":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "5th Ave":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Monumento":
                                t1.setText("P23");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Balintawak":
                                t1.setText("P25");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P27");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Vito Cruz":
                        switch (state) {
                            case "Vito Cruz":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Gil Puyat":
                            case "Quirino":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                            case "Pedro Gil":
                            case "UN Ave":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                            case "Carriedo":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Doroteo Jose":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Bambang":
                            case "Tayuman":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Blumentritt":
                                t1.setText("P18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Abad Santos":
                                t1.setText("P19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "R. Papa":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "5th Ave":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Monumento":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Balintawak":
                                t1.setText("P23");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P26");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Quirino":
                        switch (state) {
                            case "Quirino":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                            case "Pedro Gil":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Gil Puyat":
                            case "UN Ave":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                            case "Central":
                            case "Carriedo":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Doroteo Jose":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Bambang":
                            case "Tayuman":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Blumentritt":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Abad Santos":
                                t1.setText("P18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "R. Papa":
                                t1.setText("P19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "5th Ave":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Monumento":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Balintawak":
                                t1.setText("P23");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P25");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Pedro Gil":
                        switch (state) {
                            case "Pedro Gil":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                            case "UN Ave":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                            case "Central":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                            case "Carriedo":
                            case "Doroteo Jose":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "EDSA":
                            case "Bambang":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "Tayuman":
                            case "Blumentritt":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Abad Santos":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "R. Papa":
                                t1.setText("P18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "5th Ave":
                                t1.setText("P19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Monumento":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Balintawak":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P24");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "UN Ave":
                        switch (state) {
                            case "UN Ave":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Pedro Gil":
                            case "Central":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                            case "Quirino":
                            case "Carriedo":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Gil Puyat":
                            case "Doroteo Jose":
                            case "Bambang":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                            case "Tayuman":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "EDSA":
                            case "Blumentritt":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "Abad Santos":
                            case "R. Papa":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "5th Ave":
                                t1.setText("18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Monumento":
                                t1.setText("P19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Balintawak":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P23");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Central":
                        switch (state) {
                            case "Central":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "UN Ave":
                            case "Carriedo":
                            case "Doroteo Jose":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Pedro Gil":
                            case "Bambang":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                            case "Tayuman":
                            case "Blumentritt":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                            case "Abad Santos":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                            case "R. Papa":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "EDSA":
                            case "5th Ave":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "Monumento":
                                t1.setText("18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Balintawak":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Carriedo":
                        switch (state) {
                            case "Carriedo":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                            case "Doroteo Jose":
                            case "Bambang":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "UN Ave":
                            case "Tayuman":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                            case "Pedro Gil":
                            case "Blumentritt":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                            case "Abad Santos":
                            case "R. Papa":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Gil Puyat":
                            case "5th Ave":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                            case "Monumento":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "EDSA":
                                t1.setText("18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                                t1.setText("19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Balintawak":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Doroteo Jose":
                        switch (state) {
                            case "Doroteo Jose":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                            case "Carriedo":
                            case "Bambang":
                            case "Tayuman":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Blumentritt":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                            case "Abad Santos":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                            case "R. Papa":
                            case "5th Ave":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Gil Puyat":
                            case "Monumento":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                                t1.setText("18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Balintawak":
                                t1.setText("19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Roosevelt":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Bambang":
                        switch (state) {
                            case "Bambang":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Tayuman":
                            case "Blumentritt":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                            case "Abad Santos":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "UN Ave":
                            case "R. Papa":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Pedro Gil":
                            case "5th Ave":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                            case "Monumento":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                            case "Balintawak":
                                t1.setText("18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "EDSA":
                                t1.setText("19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Tayuman":
                        switch (state) {
                            case "Tayuman":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Doroteo Jose":
                            case "Bambang":
                            case "Blumentritt":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Carriedo":
                            case "Abad Santos":
                            case "R. Papa":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                            case "5th Ave":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "UN Ave":
                            case "Monumento":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                            case "Pedro Gil":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Gil Puyat":
                            case "Balintawak":
                                t1.setText("18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                                t1.setText("19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "EDSA":
                            case "Roosevelt":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Blumentritt":
                        switch (state) {
                            case "Blumentritt":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Bambang":
                            case "Tayuman":
                            case "Abad Santos":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Doroteo Jose":
                            case "R. Papa":
                            case "5th Ave":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                            case "Carriedo":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Monumento":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                            case "Balintawak":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                                t1.setText("18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Gil Puyat":
                            case "Roosevelt":
                                t1.setText("19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Abad Santos":
                        switch (state) {
                            case "Abad Santos":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Blumentritt":
                            case "R. Papa":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Bambang":
                            case "Tayuman":
                            case "5th Ave":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Doroteo Jose":
                            case "Monumento":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                            case "Carriedo":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Balintawak":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                            case "Roosevelt":
                                t1.setText("18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                                t1.setText("19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Gil Puyat":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "R. Papa":
                        switch (state) {
                            case "R. Papa":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Abad Santos":
                            case "5th Ave":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Tayuman":
                            case "Blumentritt":
                            case "Monumento":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Bambang":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Balintawak":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "UN Ave":
                            case "Roosevelt":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Pedro Gil":
                                t1.setText("18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                                t1.setText("19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "EDSA":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                                t1.setText("P23");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "5th Ave":
                        switch (state) {
                            case "5th Ave":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "R. Papa":
                            case "Monumento":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Abad Santos":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Tayuman":
                            case "Blumentritt":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Doroteo Jose":
                            case "Bambang":
                            case "Balintawak":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Carriedo":
                            case "Roosevelt":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "UN Ave":
                                t1.setText("18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Pedro Gil":
                                t1.setText("19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "EDSA":
                                t1.setText("P23");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                                t1.setText("P24");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Monumento":
                        switch (state) {
                            case "Monumento":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "5th Ave":
                                t1.setText("P12");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Abad Santos":
                            case "Balintawak":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "R. Papa":
                                t1.setText("P14");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Tayuman":
                            case "Blumentritt":
                            case "Roosevelt":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Bambang":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Carriedo":
                            case "Doroteo Jose":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                                t1.setText("18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "UN Ave":
                                t1.setText("19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Pedro Gil":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                                t1.setText("P23");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "EDSA":
                                t1.setText("P24");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                                t1.setText("P25");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Balintawak":
                        switch (state) {
                            case "Balintawak":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Monumento":
                            case "Roosevelt":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "R. Papa":
                            case "5th Ave":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Abad Santos":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Blumentritt":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Bambang":
                            case "Tayuman":
                                t1.setText("18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Doroteo Jose":
                                t1.setText("19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                            case "Carriedo":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                                t1.setText("P23");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                                t1.setText("P24");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Gil Puyat":
                                t1.setText("P25");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                                t1.setText("P26");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                                t1.setText("P27");
                                t2.setText("Stored Value Card Price");
                                break;
                        }

                    case "Roosevelt":
                        switch (state) {
                            case "Roosevelt":
                                t1.setText("P11");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Balintawak":
                                t1.setText("P13");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Monumento":
                                t1.setText("P15");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "5th Ave":
                                t1.setText("P16");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "R. Papa":
                                t1.setText("P17");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Abad Santos":
                                t1.setText("18");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Blumentritt":
                                t1.setText("19");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Bambang":
                            case "Tayuman":
                                t1.setText("P20");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Doroteo Jose":
                                t1.setText("P21");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Central":
                            case "Carriedo":
                                t1.setText("P22");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "UN Ave":
                                t1.setText("P23");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Pedro Gil":
                                t1.setText("P24");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Quirino":
                                t1.setText("P25");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Vito Cruz":
                                t1.setText("P26");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Gil Puyat":
                                t1.setText("P27");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Libertad":
                                t1.setText("P28");
                                t2.setText("Stored Value Card Price");
                                break;

                            case "Baclaran":
                            case "EDSA":
                                t1.setText("P29");
                                t2.setText("Stored Value Card Price");
                                break;
                        }
                }
                break;

            default:

                break;
        }






    }
}
