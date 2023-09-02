package com.malugy.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhenlayout);
    }

    public void myclick(View v) {
        switch (v.getId()) {
            case R.id.frame:
                // 显示frameActivity
                startActivity(new Intent(this, FrameActivity.class));
                break;
            case R.id.table:
                startActivity(new Intent(this, Table.class));
                break;
            case R.id.grid:
                startActivity(new Intent(this, GridActivity.class));
                break;
            case R.id.constraint:
                startActivity(new Intent(this, ConstraintActivity.class));
                break;
        }
    }
}