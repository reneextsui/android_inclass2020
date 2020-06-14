package com.xuxinran46.class0607;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.xuxinran46.class0524.R;

public class MyWebActivity extends AppCompatActivity {

    private static final String TAG  = "MyWebActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_web);
        Intent intent = getIntent();
        Log.i(TAG,"--- intent:"+intent);
        Uri data = intent.getData();
        Log.i(TAG,"--- intent data:"+data );


        TextView webTV = findViewById(R.id.txt_web);
        webTV.setText(data.toString());
    }
}
