package com.example.student.team1_tuan2_cuslistviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {
    ListView lvw_1;
    ArrayList<CauThu> ls ;
    CauThuArrayAdapter arrls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        //Anh Xa:
        lvw_1 = findViewById(R.id.lvw_1);
        //Khoi tao ListView
        ls = new ArrayList<>();
        ls = CauThuModel.getListCauThuDemo();

        arrls = new CauThuArrayAdapter(CustomListViewActivity.this,R.layout.layout_cus_lisview,ls);
        lvw_1.setAdapter(arrls);
    }
}
