package com.example.student.team1_tuan2_cuslistviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class CustomGridViewActivity extends AppCompatActivity {
    GridView gv_GridView1;
    ArrayList<CauThu> arrayCauThu;
    CauThuArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view);

        gv_GridView1 = (GridView) findViewById(R.id.gv_GridView1);

        arrayCauThu = CauThuModel.getListCauThuDemo();
        adapter = new CauThuArrayAdapter(this,R.layout.activity_custom_grid_view,arrayCauThu);
        gv_GridView1.setAdapter(adapter);

    }
}
