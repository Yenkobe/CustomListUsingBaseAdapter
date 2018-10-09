package com.example.yenduys.customlistusingbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {


    Context context;

    static LayoutInflater inflater = null;

    int icons[];

    String number[];



    public CustomAdapter(Context context , int icons[] ,String number[]){

        this.context = context;
        this.icons = icons;
        this.number = number;

    }
    @Override
    public int getCount() {
        return number.length;
    }

    @Override
    public Object getItem(int position) {
        return getItemId(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       View row = convertView;

       if (row == null){

           inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

           row = inflater.inflate(R.layout.list_of_raws, null);

       }

        ImageView Img = (ImageView) row.findViewById(R.id.imagenView);
        TextView tv = (TextView) row.findViewById(R.id.textView);


        Img.setImageResource(icons[position]);
        tv.setText(number[position]);


        return row;
    }
}
