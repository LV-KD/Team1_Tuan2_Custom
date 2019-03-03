package com.example.student.team1_tuan2_cuslistviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlayerArrayAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<Player> myLstPlayer;

    public PlayerArrayAdapter(Context myContext, int myLayout, List<Player> myLstPlayer) {
        this.myContext = myContext;
        this.myLayout = myLayout;
        this.myLstPlayer = myLstPlayer;
    }
    private class ViewHolder {
        private TextView tv_name1;
        private ImageView img_cus1;
    }
    @Override
    public int getCount() {
        return myLstPlayer.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(myLayout, null);
            holder = new ViewHolder();
            holder.tv_name1 = view.findViewById(R.id.tv_name);
            holder.img_cus1 = view.findViewById(R.id.img_cus);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.tv_name1.setText(myLstPlayer.get(position).getName());
        holder.img_cus1.setImageResource(myLstPlayer.get(position).getImg_id());
        return view;
    }
}
