package com.example.yenduys.customlistusingbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomBaseAdapter extends BaseAdapter{


    Context ctx;
    LayoutInflater lInflater;
    ArrayList<Product> objects;

    CustomBaseAdapter(Context context, ArrayList<Product> products) {
        ctx = context;
        objects = products;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.list_template, parent, false);
        }

        Product p = getProduct(position);

        // fill the View in the list item with data from the goods: name, price
        // and picture
        ((TextView) view.findViewById(R.id.Title)).setText(p.title);
        ((TextView) view.findViewById(R.id.Caption)).setText(p.caption);
        ((ImageView) view.findViewById(R.id.ListImage)).setImageResource(p.image);


        return view;
    }


    //========================================//
    Product getProduct(int position) {
        return ((Product) getItem(position));
    }


}
