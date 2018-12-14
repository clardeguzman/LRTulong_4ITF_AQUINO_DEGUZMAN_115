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

import org.w3c.dom.Text;

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
        int price;
        int addedValue=0;

        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("ADJUSTED_PRICE", 0);


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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "EDSA":
                        switch (state) {
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Libertad":
                        switch (state) {
                            case "Baclaran":
                            case "EDSA":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Gil Puyat":
                        switch (state) {
                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Monumento":
                            case "Balintawak":
                            case "Roosevelt":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                            case "Roosevelt":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                            case "Roosevelt":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "5th Ave":
                            case "Monumento":
                            case "Balintawak":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                            case "Baclaran":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Monumento":
                            case "Balintawak":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
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
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "Balintawak":
                            case "Roosevelt":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Balintawak":
                            case "Roosevelt":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Balintawak":
                            case "Roosevelt":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Roosevelt":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

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
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Roosevelt":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Monumento":
                        switch (state) {
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                            case "Balintawak":
                            case "Roosevelt":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Balintawak":
                        switch (state) {
                            case "R. Papa":
                            case "5th Ave":
                            case "Monumento":
                            case "Roosevelt":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Libertad":
                            case "Gil Puyat":
                            case "Vito Cruz":
                            case "Quirino":
                            case "Pedro Gil":
                            case "UN Ave":
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Roosevelt":
                        switch (state) {
                            case "Monumento":
                            case "Balintawak":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Bambang":
                            case "Tayuman":
                            case "Blumentritt":
                            case "Abad Santos":
                            case "R. Papa":
                            case "5th Ave":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
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
                                price = 30 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;
                }
                break;

            case R.id.button2:
                im.setImageResource(R.drawable.svc);
                t1.setTextColor(Color.parseColor("#FFFFFF"));
                t2.setTextColor(Color.parseColor("#FFFFFF"));
                t2.setText("Stored Value Card Price");
                switch (country) {
                    case "Baclaran":
                        switch (state) {
                            case "Baclaran":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "UN Ave":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Carriedo":
                            case "Doroteo Jose":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Bambang":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Tayuman":
                            case "Blumentritt":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Abad Santos":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "R. Papa":
                                price = 23 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "5th Ave":
                                price = 24 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Monumento":
                                price = 25 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                                price = 26 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 29 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "EDSA":
                        switch (state) {
                            case "EDSA":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "Libertad":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Gil Puyat":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                            case "Pedro Gil":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "UN Ave":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Carriedo":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Doroteo Jose":
                            case "Bambang":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Tayuman":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Blumentritt":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Abad Santos":
                            case "R. Papa":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "5th Ave":
                                price = 23 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Monumento":
                                price = 24 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                                price = 27 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 29 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Libertad":
                        switch (state) {
                            case "Libertad":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                            case "Gil Puyat":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "Vito Cruz":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                            case "Pedro Gil":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "UN Ave":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Carriedo":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Doroteo Jose":
                            case "Bambang":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Tayuman":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Blumentritt":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Abad Santos":
                            case "R. Papa":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "5th Ave":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Monumento":
                                price = 23 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                                price = 26 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 29 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Gil Puyat":
                        switch (state) {
                            case "Gil Puyat":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                            case "Vito Cruz":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Quirino":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                            case "Carriedo":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Doroteo Jose":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;


                            case "Bambang":
                            case "Tayuman":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Blumentritt":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Abad Santos":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;


                            case "R. Papa":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "5th Ave":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Monumento":
                                price = 23 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                                price = 25 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 27 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Vito Cruz":
                        switch (state) {
                            case "Vito Cruz":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Gil Puyat":
                            case "Quirino":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                            case "Pedro Gil":
                            case "UN Ave":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                            case "Carriedo":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Doroteo Jose":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Bambang":
                            case "Tayuman":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Blumentritt":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Abad Santos":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "R. Papa":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "5th Ave":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Monumento":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                                price = 23 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 26 + intValue;
                                t1.setText(Integer.toString(price));;
                                break;
                        }
                        break;

                    case "Quirino":
                        switch (state) {
                            case "Quirino":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                            case "Pedro Gil":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Gil Puyat":
                            case "UN Ave":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                            case "Central":
                            case "Carriedo":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Doroteo Jose":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Bambang":
                            case "Tayuman":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Blumentritt":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Abad Santos":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "R. Papa":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "5th Ave":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Monumento":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                                price = 23 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 25 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Pedro Gil":
                        switch (state) {
                            case "Pedro Gil":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                            case "UN Ave":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                            case "Central":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                            case "Carriedo":
                            case "Doroteo Jose":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                            case "Bambang":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "Tayuman":
                            case "Blumentritt":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Abad Santos":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "R. Papa":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "5th Ave":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Monumento":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 24 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "UN Ave":
                        switch (state) {
                            case "UN Ave":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                            case "Central":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                            case "Quirino":
                            case "Carriedo":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Gil Puyat":
                            case "Doroteo Jose":
                            case "Bambang":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                            case "Tayuman":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                            case "Blumentritt":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "Abad Santos":
                            case "R. Papa":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "5th Ave":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Monumento":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 23 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Central":
                        switch (state) {
                            case "Central":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "UN Ave":
                            case "Carriedo":
                            case "Doroteo Jose":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                            case "Bambang":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                            case "Tayuman":
                            case "Blumentritt":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                            case "Abad Santos":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                            case "R. Papa":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                            case "5th Ave":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "Monumento":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Carriedo":
                        switch (state) {
                            case "Carriedo":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                            case "Doroteo Jose":
                            case "Bambang":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "UN Ave":
                            case "Tayuman":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                            case "Pedro Gil":
                            case "Blumentritt":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                            case "Abad Santos":
                            case "R. Papa":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Gil Puyat":
                            case "5th Ave":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                            case "Monumento":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Doroteo Jose":
                        switch (state) {
                            case "Doroteo Jose":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                            case "Carriedo":
                            case "Bambang":
                            case "Tayuman":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Blumentritt":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                            case "Abad Santos":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                            case "R. Papa":
                            case "5th Ave":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Gil Puyat":
                            case "Monumento":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                            case "Balintawak":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Roosevelt":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Bambang":
                        switch (state) {
                            case "Bambang":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Tayuman":
                            case "Blumentritt":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                            case "Abad Santos":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "UN Ave":
                            case "R. Papa":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                            case "5th Ave":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                            case "Monumento":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                            case "Balintawak":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "Roosevelt":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Tayuman":
                        switch (state) {
                            case "Tayuman":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Doroteo Jose":
                            case "Bambang":
                            case "Blumentritt":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Carriedo":
                            case "Abad Santos":
                            case "R. Papa":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                            case "5th Ave":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "UN Ave":
                            case "Monumento":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                            case "Pedro Gil":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Gil Puyat":
                            case "Balintawak":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                            case "Roosevelt":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Blumentritt":
                        switch (state) {
                            case "Blumentritt":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Bambang":
                            case "Tayuman":
                            case "Abad Santos":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Doroteo Jose":
                            case "R. Papa":
                            case "5th Ave":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                            case "Carriedo":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Monumento":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                            case "Balintawak":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Gil Puyat":
                            case "Roosevelt":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Abad Santos":
                        switch (state) {
                            case "Abad Santos":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Blumentritt":
                            case "R. Papa":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Bambang":
                            case "Tayuman":
                            case "5th Ave":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Doroteo Jose":
                            case "Monumento":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                            case "Carriedo":
                                price = 15;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                            case "Roosevelt":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Gil Puyat":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "R. Papa":
                        switch (state) {
                            case "R. Papa":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Abad Santos":
                            case "5th Ave":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Tayuman":
                            case "Blumentritt":
                            case "Monumento":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Bambang":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Carriedo":
                            case "Doroteo Jose":
                            case "Balintawak":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "UN Ave":
                            case "Roosevelt":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                                price = 23 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "5th Ave":
                        switch (state) {
                            case "5th Ave":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "R. Papa":
                            case "Monumento":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Abad Santos":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Tayuman":
                            case "Blumentritt":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Doroteo Jose":
                            case "Bambang":
                            case "Balintawak":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Carriedo":
                            case "Roosevelt":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "UN Ave":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                                price = 23 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                                price = 24 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Monumento":
                        switch (state) {
                            case "Monumento":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "5th Ave":
                                price = 12 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Abad Santos":
                            case "Balintawak":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "R. Papa":
                                price = 14 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Tayuman":
                            case "Blumentritt":
                            case "Roosevelt":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Bambang":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Carriedo":
                            case "Doroteo Jose":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "UN Ave":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                            case "Gil Puyat":
                                price = 23 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "EDSA":
                                price = 24 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                                price = 25 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Balintawak":
                        switch (state) {
                            case "Balintawak":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Monumento":
                            case "Roosevelt":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "R. Papa":
                            case "5th Ave":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Abad Santos":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Blumentritt":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Bambang":
                            case "Tayuman":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Doroteo Jose":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                            case "Carriedo":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                            case "UN Ave":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                                price = 23 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                                price = 24 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Gil Puyat":
                                price = 25 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                                price = 26;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                                price = 27 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;

                    case "Roosevelt":
                        switch (state) {
                            case "Roosevelt":
                                price = 11 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Balintawak":
                                price = 13 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Monumento":
                                price = 15 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "5th Ave":
                                price = 16 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "R. Papa":
                                price = 17 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Abad Santos":
                                price = 18 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Blumentritt":
                                price = 19 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Bambang":
                            case "Tayuman":
                                price = 20 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Doroteo Jose":
                                price = 21 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Central":
                            case "Carriedo":
                                price = 22 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "UN Ave":
                                price = 23 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Pedro Gil":
                                price = 24 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Quirino":
                                price = 25 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Vito Cruz":
                                price = 26 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Gil Puyat":
                                price = 27 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Libertad":
                                price = 28 + intValue;
                                t1.setText(Integer.toString(price));
                                break;

                            case "Baclaran":
                            case "EDSA":
                                price = 29 + intValue;
                                t1.setText(Integer.toString(price));
                                break;
                        }
                        break;
                }
                break;

            default:

                break;
        }

    }
}
