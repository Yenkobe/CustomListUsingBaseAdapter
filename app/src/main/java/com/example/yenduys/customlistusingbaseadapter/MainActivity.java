package com.example.yenduys.customlistusingbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView lv;

    int icon [] = {R.drawable.uno , R.drawable.dos};

    String numbers []= {"Yenduy "," natalia"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.ListView);

        lv.setAdapter(new CustomAdapter(MainActivity.this, icon , numbers));

    }
}
