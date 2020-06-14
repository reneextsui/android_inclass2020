package com.xuxinran46.class0531;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.xuxinran46.class0531.Boy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.xuxinran46.class0524.R;

public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //绑定activity对应的布局
        setContentView(R.layout.activity_custom);
        final EditText nameEdt = findViewById(R.id.edt_name);
        final EditText ageEdt = findViewById(R.id.edt_age);
        Button cmitBtn = findViewById(R.id.btn_commit);
        cmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomActivity.this, DisplayActivity.class);
                String nameVal = nameEdt.getText().toString().trim();
                String ageVal = ageEdt.getText().toString().trim();
                intent.putExtra("name",nameVal);
                intent.putExtra("age",Integer.valueOf(ageVal));
                //跳转
                startActivity(intent);

                /*//复杂数据传递（传递对象）
                Boy boy = new Boy();
                boy.setName("王兰花");
                boy.setAge(22);
                Intent complexIntent = new Intent(CustomActivity.this,DisplayActivity.class);
                complexIntent.putExtra("user",boy);
                startActivity(complexIntent);*/

            }
        });
    }
}
