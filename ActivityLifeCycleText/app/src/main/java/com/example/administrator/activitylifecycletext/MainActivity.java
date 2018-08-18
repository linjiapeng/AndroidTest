package com.example.administrator.activitylifecycletext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        setContentView(R.layout.activity_main);
        Button startNormalActivity=(Button)findViewById(R.id.start_normal_activity);
        Button startDialogActivity=(Button)findViewById(R.id.start_dialog_activity);
        Button EscMainActivity=(Button)findViewById(R.id.Esc_main_activity);
        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Overridewq
            public void onClick(View view_1) {
                Intent intent=new Intent("com.example.activitytest.Normal_Activity");

                startActivity(intent);
            }
        });
        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });
        EscMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCollector.finishAll();
            }
        });
    }
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG,"onStart");
    }
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG,"onResume");
    }
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG,"onPause");
    }
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG,"onStop");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }
}
