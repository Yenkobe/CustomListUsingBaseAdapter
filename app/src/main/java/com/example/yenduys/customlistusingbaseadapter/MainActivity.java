package com.example.yenduys.customlistusingbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Product> products = new ArrayList<Product>();
    CustomBaseAdapter CustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        products.add(new Product("Product Title", "Caption", R.drawable.uno));
        CustomAdapter = new CustomBaseAdapter(this, products);

        ListView listViewMain = (ListView) findViewById(R.id.ListView_Main);
        listViewMain.setAdapter(CustomAdapter);
    }
}
