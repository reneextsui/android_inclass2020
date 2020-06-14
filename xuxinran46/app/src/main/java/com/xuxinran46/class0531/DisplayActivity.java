package com.xuxinran46.class0531;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.xuxinran46.class0524.R;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        //获取别处传递过来的intent
        Intent intent = getIntent();
        Log.i("Display","intent"+intent);
        //获取intent里面附带参数(简单数据)
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age",-1);
        //Log.i("display","intent extra name:"+ name +"age:"+age);
        String content = "intent extra name: "+ name +" age: "+age;
        TextView contentTxt = findViewById(R.id.txt_content);
        contentTxt.setText(content);
        /*//获取复杂数据
        Boy user = (Boy)intent.getSerializableExtra("user");
        String name = user.getName();
        Log.i("Display","name"+name);*/
    }
}
