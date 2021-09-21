package com.example.timestable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <Integer> oneTable = new ArrayList<Integer>();
    ArrayList <Integer> twoTable = new ArrayList<Integer>();
    ArrayList <Integer> threeTable = new ArrayList<Integer>();
    ArrayList <Integer> fourTable = new ArrayList<Integer>();
    ArrayList <Integer> fiveTable = new ArrayList<Integer>();
    ArrayList <Integer> sixTable = new ArrayList<Integer>();
    ArrayList <Integer> sevenTable = new ArrayList<Integer>();
    ArrayList <Integer> eightTable = new ArrayList<Integer>();
    ArrayList <Integer> nineTable = new ArrayList<Integer>();
    ArrayList <Integer> tenTable = new ArrayList<Integer>();
    ArrayList <Integer> elevenTable = new ArrayList<Integer>();
    ArrayList <Integer> twelveTable = new ArrayList<Integer>();
    ArrayList <Integer> thirteenTable = new ArrayList<Integer>();
    ArrayList <Integer> fourteenTable = new ArrayList<Integer>();
    ArrayList <Integer> fifteenTable = new ArrayList<Integer>();
    ArrayList <Integer> sixteenTable = new ArrayList<Integer>();
    ArrayList <Integer> seventeenTable = new ArrayList<Integer>();
    ArrayList <Integer> eighteenTable = new ArrayList<Integer>();
    ArrayList <Integer> nineteenTable = new ArrayList<Integer>();
    ArrayList <Integer> twentyTable = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar timeTable = (SeekBar) findViewById(R.id.seekBar);
        ListView listView = (ListView) findViewById(R.id.listView);
        for (int i=1;i<11;i++) {
            oneTable.add(1*i);
            twoTable.add(2*i);
            threeTable.add(3*i);
            fourTable.add(4*i);
            fiveTable.add(5*i);
            sixTable.add(6*i);
            sevenTable.add(7*i);
            eightTable.add(8*i);
            nineTable.add(9*i);
            tenTable.add(10*i);
            elevenTable.add(11*i);
            twelveTable.add(12*i);
            thirteenTable.add(13*i);
            fourteenTable.add(14*i);
            fifteenTable.add(15*i);
            sixteenTable.add(16*i);
            seventeenTable.add(17*i);
            eighteenTable.add(18*i);
            nineteenTable.add(19*i);
            twentyTable.add(20*i);


        }
        timeTable.setMax(19);
        timeTable.setProgress(9);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,tenTable);
        listView.setAdapter(arrayAdapter);
        timeTable.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("Current progress",Integer.toString(progress));
                String message;

                timeTable.setProgress(progress);
                if (progress == 0) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,oneTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 1) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,twoTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 2) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,threeTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 3) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,fourTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 4) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,fiveTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 5) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,sixTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 6) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,sevenTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 7) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,eightTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 8) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,nineTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 9) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,tenTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 10) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,elevenTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 11) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,twelveTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 12) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,thirteenTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 13) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,fourteenTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 14) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,fifteenTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 15) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,sixteenTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 16) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,seventeenTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 17) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,eighteenTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 18) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,nineteenTable);
                    listView.setAdapter(arrayAdapter1);

                }
                else if (progress == 19) {
                    ArrayAdapter arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,twentyTable);
                    listView.setAdapter(arrayAdapter1);

                }




            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }
}