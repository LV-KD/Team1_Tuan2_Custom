package com.example.student.team1_tuan2_cuslistviewapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CauThuArrayAdapter extends ArrayAdapter<CauThu> {
    Context context;
    int idLayout;
    ArrayList<CauThu> arrayCauThu;

    public CauThuArrayAdapter( Context context, int resource,  ArrayList<CauThu> objects) {
        super(context, resource, objects);
        this.context = context;
        this.idLayout = resource;
        this.arrayCauThu = objects;
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.layout_custom_gridview,null);

            holder = new ViewHolder();
            holder.tv_Name = convertView.findViewById(R.id.tv_Name);
            holder.img_National = convertView.findViewById(R.id.img_National);
            holder.img_Player1 = convertView.findViewById(R.id.img_player1);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv_Name.setText(arrayCauThu.get(position).getTenCauThu());
        holder.img_National.setImageResource(arrayCauThu.get(position).getImgQuocGia());
        holder.img_Player1.setImageResource(arrayCauThu.get(position).getImgCauthu());

        return convertView;
    }

    public class ViewHolder {
        TextView tv_Name;
        ImageView img_National,img_Player1;
    }
}
