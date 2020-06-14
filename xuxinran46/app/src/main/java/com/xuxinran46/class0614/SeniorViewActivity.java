package com.xuxinran46.class0614;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.xuxinran46.class0524.R;

import java.util.ArrayList;
import java.util.List;

public class SeniorViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_view);


        Button dialogBtn = findViewById(R.id.btn_dialog);
        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SeniorViewActivity.this);
                builder.setIcon(R.mipmap.p1)
                        .setTitle("标题")
                        .setMessage("今天你学习了吗？")
                        .setPositiveButton("学了", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(SeniorViewActivity.this,"你真棒",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("没有", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(SeniorViewActivity.this,"继续加油",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNeutralButton("学了一点", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(SeniorViewActivity.this,"还不错",Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        /**
         * 以列表展示数据3个元素，ListView、数据源、Adapter
         */
        ListView listView = findViewById(R.id.lv);
        List<News> dataList = new ArrayList<>();
        for (int i = 0; i<20; i++){
            News item = new News();
            item.setPicId(R.mipmap.p1);
            item.setTitle(i+"同学居然在课堂上做这种事情");
            dataList.add(item);
        }
        //Adapter是绑定ListView和data的桥梁
        NewsAdapter adapter = new NewsAdapter(SeniorViewActivity.this,dataList);
        listView.setAdapter(adapter);
    }
}
