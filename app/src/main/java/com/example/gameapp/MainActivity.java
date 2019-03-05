package com.example.gameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn_start);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
         public void onClick(View v){
        //Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。
        //在存放资源代码的文件夹下下， 
         Intent i = new Intent(MainActivity.this,Main2Activity.class);
        //启动 
         startActivity(i);}
      });
    }
}
