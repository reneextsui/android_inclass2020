package com.xuxinran46.class0607;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.xuxinran46.class0524.R;

public class FlagActivity extends AppCompatActivity {

    private static final String TAG = "FlagActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag);

        findViewById(R.id.btn_intent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(FlagActivity.this,IntentActivity.class));
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
