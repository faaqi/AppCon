package com.example.appconn_telenor.profile_level_fragments;

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
import com.example.appconn_telenor.recognition_level_fragments.Post_Row;

import java.util.ArrayList;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<ProfilePost_Row> posts;

    public PostsAdapter(Context context, ArrayList<ProfilePost_Row> arrayList) {
        this.context = context;
        this.posts = arrayList;
    }

    @NonNull
    @Override
    public PostsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.profile_post_row, parent, false);
        return new PostsAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostsAdapter.MyViewHolder holder, int position) {

        ProfilePost_Row msgFrom = posts.get(position);

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

        ImageView post_pic= holder.postImg;
        if (msgFrom.getImgUrl()==null){
            holder.postImg.setVisibility(View.GONE);
        }else {
            Glide.with(context).load(msgFrom.getImgUrl()).into(post_pic);
        }

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
        public ImageView postImg;
        public TextView likes;
        public TextView desc;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.Profile_post_user_name);
            profilePic = itemView.findViewById(R.id.profile_Post_pic);
            jobPosition = itemView.findViewById(R.id.profile_job_post);
            time = itemView.findViewById(R.id.profile_post_time_ago);
            likes = itemView.findViewById(R.id.profile_num_likes);
            desc = itemView.findViewById(R.id.profile_post_desc);
            postImg = itemView.findViewById(R.id.profile_post_img);


        }
    }
}