package com.example.student.team1_tuan2_cuslistviewapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnListView(View view) {
        Intent it = new Intent(MainActivity.this,CustomListViewActivity.class);
        startActivity(it);
    }
}
