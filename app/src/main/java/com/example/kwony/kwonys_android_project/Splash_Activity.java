package com.example.kwony.kwonys_android_project;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        TextView textView = (TextView) findViewById(R.id.sdfsdfsdf);
        textView.setText("Hello World 영훈");

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {     //postDelayed란것은 어떠한 method인지 등에 대한 정보는 어디서 찾나?
                                                //일반적으로 어떠한 method 가 존재하는지에 대한 정보를 다알면 앱 개발 능력이
                                                    // 상승할 것 같은데 이를 공부하는 방법은?
            @Override //여기 이 override는 어떤 override 인지.. Extends 도 없는데;;
            public void run() {
                Intent intent = new Intent(Splash_Activity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000); //2초 이따가 시작하라는 의미 굳이 왜 새창을 2초 있다가 여는지?

    }
}
