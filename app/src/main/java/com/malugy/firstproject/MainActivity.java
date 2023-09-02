package com.malugy.firstproject;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        // 1.根布局为线性布局
//        LinearLayout ll = new LinearLayout(this);
//        // 2.设置宽高
//        ll.setLayoutParams(new LinearLayout.LayoutParams(
//                // 参数1：宽，参数2：高，这里设置为和窗口一样大
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT
//        ));
//        // 3.背景设为红色
//        ll.setBackgroundColor(Color.RED);
//        // 4.指定此activity的视图为该线性布局
//        setContentView(ll);
    }

    public void register(View v) {
        ProgressBar pb = findViewById(R.id.probar);
        EditText nameEdt = findViewById(R.id.name);
        EditText pwdEdt = findViewById(R.id.pwd);

        String name = nameEdt.getText().toString();
        String pwd = pwdEdt.getText().toString();
        // 1. 判断姓名密码是否为空
        if (name.equals("") || pwd.equals("")) {
            // 2. 为空,提示
            // 无焦点提示
            // 参数1: 环境上下文; 参数2: 提示性文本; 参数3: 提示持续时间
            Toast.makeText(this, "姓名或密码不能为空", Toast.LENGTH_SHORT).show();
        } else {
            // 3. 都不为空,则出现进度条(这里使用进度条只是为了教学演示)
            pb.setVisibility(View.VISIBLE);
            new Thread() {
                @Override
                public void run() {
                    for (int i = 0; i <= 100; i++) {
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
}