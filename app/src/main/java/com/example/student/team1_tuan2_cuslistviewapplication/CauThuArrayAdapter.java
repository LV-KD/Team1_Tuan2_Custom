package com.example.student.team1_tuan2_cuslistviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CauThuArrayAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<CauThu> myLsCauThu;

    public CauThuArrayAdapter(Context myContext, int myLayout, List<CauThu> myLsCauThu) {
        this.myContext = myContext;
        this.myLayout = myLayout;
        this.myLsCauThu = myLsCauThu;
    }

    @Override
    public int getCount() {
        return myLsCauThu.size();
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
        ViewHolder holder;
        if(view==null){
            LayoutInflater inflater = (LayoutInflater)myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(myLayout,null);
            holder = new ViewHolder();
            holder.tv_name = view.findViewById(R.id.tv_name);
            holder.img_player1 = view.findViewById(R.id.img_player1);
            holder.img_quocgia = view.findViewById(R.id.img_quocgia);

            view.setTag(holder);
        }else holder = (ViewHolder)view.getTag();
        //gan gia tri lai cho List Country
        holder.tv_name.setText(myLsCauThu.get(i).getTenCauThu());
        holder.img_player1.setImageResource(myLsCauThu.get(i).getImgCauthu());
        holder.img_quocgia.setImageResource(myLsCauThu.get(i).getImgQuocGia());
        return view;
    }
    private class ViewHolder{
        private TextView tv_name;
        private ImageView img_player1,img_quocgia;
    }
}
