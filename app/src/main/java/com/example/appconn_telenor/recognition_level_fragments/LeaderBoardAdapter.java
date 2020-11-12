package com.example.appconn_telenor.recognition_level_fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.appconn_telenor.R;

import java.util.ArrayList;

public class LeaderBoardAdapter extends RecyclerView.Adapter<LeaderBoardAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Emp_Points_Row> employees;

    public LeaderBoardAdapter(Context context, ArrayList<Emp_Points_Row> arrayList) {
        this.context = context;
        this.employees = arrayList;
    }

    @NonNull
    @Override
    public LeaderBoardAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.emp_points_row, parent, false);
        return new LeaderBoardAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LeaderBoardAdapter.MyViewHolder holder, int position) {

        Emp_Points_Row msgFrom = employees.get(position);

        TextView user_name= holder.name;
        user_name.setText(msgFrom.getUserName());

        TextView user_job= holder.jobPosition;
        user_job.setText(msgFrom.getJobPosition());

        TextView point= holder.points;
        point.setText(msgFrom.getPoints());

        ImageView profile_pic= holder.profilePic;
        Glide.with(context).load(msgFrom.getProfilePicUrl()).into(profile_pic);

    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView profilePic;
        public TextView jobPosition;
        public TextView points;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.leader_user_name);
            profilePic = itemView.findViewById(R.id.leader_profile_pic);
            jobPosition = itemView.findViewById(R.id.leader_job_post);
            points = itemView.findViewById(R.id.leader_points);
        }
    }
}