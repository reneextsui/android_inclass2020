package com.xuxinran46.class0531;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.xuxinran46.class0524.R;

public class ForResultActivity extends AppCompatActivity {

    private static final int Request_code_edt = 10;

    TextView mContentTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_result);

        mContentTxt= findViewById(R.id.txt_content);
        Button setBtn = findViewById(R.id.btn_set);
        setBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForResultActivity.this,EditActivity.class);

                startActivityForResult(intent,Request_code_edt);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,resultCode, data);
        switch (requestCode){
            case Request_code_edt:{
                if (RESULT_OK==resultCode){
                    String name = data.getStringExtra("name");
                    int age = data.getIntExtra("age",-1);
                    String content = "intent extra name: "+ name + " age: "+ age;
                    mContentTxt.setText(content);
                }else{
                    Toast.makeText(this,"用户取消了操作",Toast.LENGTH_SHORT).show();

                }
            }
        }
    }


}
