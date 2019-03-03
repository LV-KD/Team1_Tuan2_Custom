package com.example.student.team1_tuan2_cuslistviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomSpinnerActivity extends AppCompatActivity {
    TextView tvname;
    Spinner sp;
    ArrayList<Player> arrP;
    PlayerArrayAdapter arrayAdapterLs = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner);

        anhxa();

        arrP = PlayerModel.getListPlayerDemo();
        arrayAdapterLs = new PlayerArrayAdapter( this,R.layout.cus_spinner_layout,arrP);
        sp.setAdapter(arrayAdapterLs);

        /*sp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Player p = arrP.get(position);
                tvname.setText(p.getName());
            }
         });*/
        
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Player p = arrP.get(position);
                tvname.setText(p.getName());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void anhxa() {
        tvname = findViewById(R.id.tv_ten);
        sp = findViewById(R.id.sp_item);
    }
}
