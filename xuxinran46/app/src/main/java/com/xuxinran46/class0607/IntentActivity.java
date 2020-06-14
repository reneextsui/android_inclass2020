package com.xuxinran46.class0607;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.xuxinran46.class0524.R;

public class IntentActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "IntentActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);


        findViewById(R.id.btn_dial).setOnClickListener(this);
        findViewById(R.id.btn_start_flag).setOnClickListener(this);
        findViewById(R.id.btn_web).setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_dial:{
                //隐式启动
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:13852262666"));
                startActivity(intent);
            }break;
            case R.id.btn_start_flag:{
                Intent intent = new Intent(IntentActivity.this,FlagActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                startActivity(intent);
            }break;
            case R.id.btn_web:{
                this.toWeb(v);
                //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com")));
            }break;
            default:
                break;
        }
    }

    public void toWeb(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.baidu.com"));
        Intent chooser = Intent.createChooser(intent, "选浏览器");
        //确定是否有应用可以处理这个Intent
        if (intent.resolveActivity(getPackageManager())!=null){
            startActivity(chooser);
        }else {
            Toast.makeText(this,"本设备没有app支持打开该链接",Toast.LENGTH_SHORT).show();
        }
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
