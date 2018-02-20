package com.example.asus.klasseandroid;

/**
 * Created by ASUS on 20-02-2018.
 */
import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class DisplayAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<String> content;



    public DisplayAdapter(Context c,ArrayList<String> text) {
        this.mContext = c;

        this.content = text;

    }

    public int getCount() {
        // TODO Auto-generated method stub
        return content.size();
    }

    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    public View getView(int pos, View child, ViewGroup parent) {
        Holder mHolder;
        LayoutInflater layoutInflater;
        if (child == null) {
            layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            child = layoutInflater.inflate(R.layout.announcement, null);
            mHolder = new Holder();
            mHolder.txt_content = (TextView) child.findViewById(R.id.announcetext);

            child.setTag(mHolder);
        } else {
            mHolder = (Holder) child.getTag();
        }
        mHolder.txt_content.setText(content.get(pos));

        return child;
    }

    public class Holder {
        TextView txt_content;


    }

}
