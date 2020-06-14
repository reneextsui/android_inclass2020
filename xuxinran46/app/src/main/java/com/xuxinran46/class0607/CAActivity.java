package com.xuxinran46.class0607;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.xuxinran46.class0524.R;

public class CAActivity extends AppCompatActivity {
    private static final String TAG  = "CAActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_a);
        Intent intent = getIntent();
        Log.i(TAG,"--- intent:"+intent);
        Uri data = intent.getData();
        Log.i(TAG,"--- intent data:"+data );

        TextView dialTV = findViewById(R.id.txt_tel);
        dialTV.setText(data.toString());
    }
}
