package com.malugy.firstproject;

import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class ProgressBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        ProgressBar pb = findViewById(R.id.progress);
        pb.setProgress(80);
        // android4.0后不能直接在线程中操作控件,否则会崩溃
        // 进度条是特例
        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    pb.setProgress(i);
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}