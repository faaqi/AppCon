package com.example.appconn_telenor;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Todo_adapter extends
        RecyclerView.Adapter<Todo_adapter.ViewHolder> {

    private List<todo_item> mTasks;

    public Todo_adapter(List<todo_item> tasks) {
        mTasks = tasks;
    }

    @Override
    public Todo_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View taskView = inflater.inflate(R.layout.todo_row, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(taskView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

       todo_item task_item = mTasks.get(position);

        CheckBox check_task = holder.check;
        check_task.setChecked(task_item.isChecked());

        TextView task = holder.task;
        task.setText(task_item.getName());

        task.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                mTasks.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position,mTasks.size());
                return false;
            }
        });

    }
    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mTasks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public CheckBox check;
        public TextView task;

        public ViewHolder(View itemView) {
            super(itemView);

            check = (CheckBox) itemView.findViewById(R.id.checkbox);
            task = (TextView) itemView.findViewById(R.id.task_todo);
        }
    }
}