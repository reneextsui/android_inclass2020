package com.xuxinran46.class0607;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

import com.xuxinran46.class0524.R;

public class LifeActivity extends AppCompatActivity {

    private static final String TAG = "LifeActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"---- onClick"+ this);
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_life);
        View startBtn = findViewById(R.id.btn_start);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LifeActivity.this, ModeActivity.class);
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
