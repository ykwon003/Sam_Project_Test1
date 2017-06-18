package com.example.kwony.kwonys_android_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Hawk.init(this).build();

        ArrayList<Todo> todos = Hawk.get("box1");
        if (todos == null) {
            todos = new ArrayList<>();
            for (int i = 0; i < 30; i++) {
                Todo todo = new Todo();
                todo.setCategory("category " + i);
                todo.setContents("contents " + i);
                todo.setTime("time : " + i);
                todo.setPlace("place : " + i);
                todos.add(todo);
            }
            Hawk.put("box1", todos);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.RV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));  //외울것 -> 레이아웃 구성이 어떻게 되는지 부분

        TodoAdaptor adapter = new TodoAdaptor();
        recyclerView.setAdapter(adapter);

    }
}
