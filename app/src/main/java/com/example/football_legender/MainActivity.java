package com.example.football_legender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] nameArray = {"Pele","Johan Cruift","Frantz Beckenbauer","Maradona","Michel Platini","Ronaldo De Lima" };

    String[] infoArray = {
            "October 23, 1940 (age 72)",
            "April 25, 1947 (age 65)",
            "September 11, 1945 (age 67)",
            "October 30 , 1960 (age 52)",
            "june 21, 1955 (age 57)",
            "September 22, 1976 (age 36"

    };

    Integer[] imageArray = {R.drawable.m1,
            R.drawable.m4,
            R.drawable.m3,
            R.drawable.m2,
            R.drawable.m5,
            R.drawable.m6,


    };

    Integer[] imageIdArrayCountry = {
            R.drawable.f1,
            R.drawable.f4,
            R.drawable.f3,
            R.drawable.f2,
            R.drawable.f5,
            R.drawable.f6
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustumListAdapter whatever = new CustumListAdapter(this,  imageArray,nameArray, infoArray,imageIdArrayCountry);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(whatever);
    }
}