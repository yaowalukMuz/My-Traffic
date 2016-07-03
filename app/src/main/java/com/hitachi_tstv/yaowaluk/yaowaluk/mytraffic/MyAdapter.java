package com.hitachi_tstv.yaowaluk.yaowaluk.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by musz on 7/3/2016.
 */
public class MyAdapter extends BaseAdapter{
    //Explicit
    private Context context;
    private int[] iconInts;
    private String[] nameStrings,detailStrings;


    // Constructer
    public MyAdapter(String[] detailStrings,
                     String[] nameStrings,
                     int[] iconInts,
                     Context context) {
        this.detailStrings = detailStrings;
        this.nameStrings = nameStrings;
        this.iconInts = iconInts;
        this.context = context;
    }

    @Override
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // Open service
        // create visual layout cal service layout inflater service
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // โยน Listview ไปยัง listview
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //Bind Widget
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        TextView nameTextView = (TextView) view1.findViewById(R.id.textView2);
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);

        //show view
        iconImageView.setImageResource(iconInts[i]);
        nameTextView.setText(nameStrings[i]);
        detailTextView.setText(detailStrings[i]);

        return view1;
    }


    //Bean Setter Getter



}//Main Method
