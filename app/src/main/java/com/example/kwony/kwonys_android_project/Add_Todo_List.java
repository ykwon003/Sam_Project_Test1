package com.example.kwony.kwonys_android_project;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;

public class Add_Todo_List extends AppCompatActivity {

    EditText category;
    EditText contents;
    EditText place;
    EditText time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Hawk.init(this).build();
        setContentView(R.layout.activity_add__todo__list);

        category = (EditText) findViewById(R.id.et_category);
        contents = (EditText) findViewById(R.id.et_contents);
        place = (EditText) findViewById(R.id.et_place);
        time = (EditText) findViewById(R.id.et_time);






        Button buttonClick = (Button) findViewById(R.id.btn);
        buttonClick.setOnClickListener(new View.OnClickListener() //여기서 View가 왜 뷰라는 이름을 얻었나? 어떠한 기능 (class)인지?
        {
            @Override
            public void onClick(View v) //interface -> onclicklistener -> 탈것에는 달린다라는 기능이 있음 bicycle, car 라는것의 달리는 개념은 다르지만
            {                           //interface 는 변수를 들고 있을 수가 없다. v 라는것은 추상적인 변수 개념
                                        //button 이건뭐건 대부분 레이아웃이 view 로 구성. 여기서 v -> onclick -> button (btn) 으로 연결됨
                String etCategory = category.getText().toString();
                String etContents = contents.getText().toString();
                String etPlace = place.getText().toString();
                String etTime = time.getText().toString();

                Todo todo1 = new Todo();
                todo1.setCategory(etCategory);
                todo1.setContents(etContents);
                todo1.setPlace(etPlace);
                todo1.setTime(etTime);

                ArrayList<Todo> todo = Hawk.get("box1");
                if (todo == null)
                {
                    todo = new ArrayList<Todo>();
                }

                todo.add(todo1);
                Hawk.put("box1", todo);

                Log.v("TAG", "추가 되었습니다. 현재 몇 개?" + todo.size());

                finish();

            }


        });


    }
}
