package com.example.ic14;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdaptor extends RecyclerView.Adapter<TaskAdaptor.ViewHolder> {
    ArrayList<Task> mData;

    public TaskAdaptor(ArrayList<Task> mData) {
        this.mData = mData;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Task task = mData.get(position);
        holder.textViewName.setText(task.getName());
        holder.textViewPriority.setText(task.getPriority());
        holder.textViewTime.setText(task.getCreated_time());
        holder.checkBox.setChecked(task.completed);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewPriority;
        TextView textViewTime;
        CheckBox checkBox;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewPriority = itemView.findViewById(R.id.textViewPriority);
            textViewTime = itemView.findViewById(R.id.textViewTime);
            checkBox = itemView.findViewById(R.id.checkBox);
        }
    }

}
