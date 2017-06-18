package com.example.kwony.kwonys_android_project;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by kwony on 6/11/17.
 */

public class TodoItemViewHolder extends RecyclerView.ViewHolder {

    TextView tvHl;
    TextView t1;
    TextView t2;
    TextView t3;

    public TodoItemViewHolder(View itemView) {
        super(itemView);
        //find view by id
        tvHl = (TextView) itemView.findViewById(R.id.HL);
        t1 = (TextView) itemView.findViewById(R.id.t1);
        t2 = (TextView) itemView.findViewById(R.id.t2);
        t3 = (TextView) itemView.findViewById(R.id.t3);

    }

    public void onBind(Todo todo) {
        tvHl.setText(todo.getContents());
        t1.setText(todo.getCategory());
        t2.setText(todo.getPlace());
        t3.setText(todo.getTime());
    }
}