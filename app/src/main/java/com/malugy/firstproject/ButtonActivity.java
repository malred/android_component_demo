package com.malugy.firstproject;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     * 自定义点击事件处理方法
     *
     * @param v 被点击的按钮
     */
    public void myClick(View v) {
        Log.e("TAG", "xml绑定");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        // 根据id获取按钮
        Button btn1 = findViewById(R.id.btn1);
        // 点击事件
        MyClickListener mcl = new MyClickListener();
        btn1.setOnClickListener(mcl); // 注册点击事件

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("TAG", "匿名内部类");
            }
        });

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.e("TAG", "activity实现接口");
    }

    // 1. 自定义实现类
    class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            // 控制台输出语句
            Log.e("TAG", "自定义内部类实现");
        }
    }
}