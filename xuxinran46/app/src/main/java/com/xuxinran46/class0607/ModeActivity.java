package com.xuxinran46.class0607;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.xuxinran46.class0524.R;

public class ModeActivity extends AppCompatActivity {
    private static final String TAG = "ModeActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"---- onClick" +  this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);
        View startBtn = findViewById(R.id.btn_start);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModeActivity.this, LifeActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn_start_mode).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModeActivity.this, ModeActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onStart(){
        Log.i(TAG,"---- onStart");
        super.onStart();
    }

    @Override
    protected void onResume(){
        Log.i(TAG,"---- onResume");
        super.onResume();
    }

    @Override
    protected void onPause(){
        Log.i(TAG,"---- onPause");
        super.onPause();
    }

    @Override
    protected void onStop(){
        Log.i(TAG,"---- onStop");
        super.onStop();
    }
}
