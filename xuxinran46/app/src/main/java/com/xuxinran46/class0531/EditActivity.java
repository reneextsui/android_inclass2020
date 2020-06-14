package com.xuxinran46.class0531;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.xuxinran46.class0524.R;


public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //绑定activity对应的布局
        setContentView(R.layout.activity_edit);
        final EditText nameEdt = findViewById(R.id.edt_name);
        final EditText ageEdt = findViewById(R.id.edt_age);
        Button cmitBtn = findViewById(R.id.btn_commit);
        cmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //使用Intent
                Intent intent = new Intent();
                String nameVal = nameEdt.getText().toString().trim();
                String ageVal = ageEdt.getText().toString().trim();
                //判断用户输入是否是空

                if (TextUtils.isEmpty(nameVal)){
                    Toast.makeText(EditActivity.this,"请输入姓名",Toast.LENGTH_SHORT).show();
                    return;

                }
                if (TextUtils.isEmpty(ageVal)){
                    Toast.makeText(EditActivity.this,"请输入年龄",Toast.LENGTH_SHORT).show();
                    return;}
                intent.putExtra("name",nameVal);
                intent.putExtra("age",Integer.valueOf(ageVal));

                setResult(RESULT_OK,intent);
                finish();


            }
        });
    }
}
