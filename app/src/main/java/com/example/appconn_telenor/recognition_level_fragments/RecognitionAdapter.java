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
import com.example.appconn_telenor.chat_level_fragments.Contact_Row;

import java.util.ArrayList;

public class RecognitionAdapter extends RecyclerView.Adapter<RecognitionAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Post_Row> posts;

    public RecognitionAdapter(Context context, ArrayList<Post_Row> arrayList) {
        this.context = context;
        this.posts = arrayList;
    }

    @NonNull
    @Override
    public RecognitionAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recognition_post_row, parent, false);
        return new RecognitionAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecognitionAdapter.MyViewHolder holder, int position) {

        Post_Row msgFrom = posts.get(position);

        TextView user_name= holder.name;
        user_name.setText(msgFrom.getUserName());

        TextView user_job= holder.jobPosition;
        user_job.setText(msgFrom.getJobPosition());

        TextView time_ago= holder.time;
        time_ago.setText(msgFrom.getPostTime());

        TextView desc= holder.desc;
        desc.setText(msgFrom.getDescription());

        TextView num_likes= holder.likes;
        num_likes.setText(msgFrom.getLikesCount());

        ImageView profile_pic= holder.profilePic;
        Glide.with(context).load(msgFrom.getProfilePicUrl()).into(profile_pic);

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView profilePic;
        public TextView jobPosition;
        public TextView time;
        public TextView likes;
        public TextView desc;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.rec_user_name);
            profilePic = itemView.findViewById(R.id.recognition_profile_image);
            jobPosition = itemView.findViewById(R.id.rec_job_post);
            time = itemView.findViewById(R.id.rec_time_ago);
            likes = itemView.findViewById(R.id.rec_num_likes);
            desc = itemView.findViewById(R.id.rec_desc);


        }
    }
}