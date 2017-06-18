package com.example.kwony.kwonys_android_project;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kwony on 6/11/17.
 */

public class TodoAdaptor extends RecyclerView.Adapter<TodoItemViewHolder> {

    ArrayList<Todo> todos;

    public TodoAdaptor() {
        todos = Hawk.get("box1");
    }

    @Override
    public TodoItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       // Log.v("TAG", "Here is in onCreateViewHolder");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_home_todo, parent, false); //이부분은 그냥 외우는게좋음 itemViewHolder 를 생성하려면 view 가 필요하니까 view 를 불러옴; view 는 TodoItemViewHolder를 담을수 있는 그릇이 되는 격. 그래서 추후에 실제 보여주기위함 (view)]
        TodoItemViewHolder viewHolder = new TodoItemViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TodoItemViewHolder holder, int position) {
      //  Log.v("TAG", "Here is in onBindViewHolder : " + position);
        Todo item = todos.get(position);
        holder.onBind(item);
    }

    @Override
    public int getItemCount() {
        if (todos == null) {
            return 0;
        }

        return todos.size();
    }
}
