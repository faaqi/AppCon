package com.example.appconn_telenor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class CheersFeedAdapter extends RecyclerView.Adapter<CheersFeedAdapter.ViewHolder> {

        private ArrayList<CheersFeed> posts;
    Context context;

    public CheersFeedAdapter(ArrayList<CheersFeed> tasks) {
        posts = tasks;
    }

    @NonNull
    @Override
    public CheersFeedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

         context= parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View taskView = inflater.inflate(R.layout.cheersfeed_row, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(taskView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        CheersFeed feedPosts = posts.get(position);

        TextView user_name= holder.name;
        user_name.setText(feedPosts.getUserName());

        TextView user_job= holder.jobPosition;
        user_job.setText(feedPosts.getJobPosition());

        TextView time_ago= holder.time;
        time_ago.setText(feedPosts.getPostTime());

        TextView desc= holder.description;
        desc.setText(feedPosts.getDescription());

        TextView count= holder.count;
        count.setText(feedPosts.getCheersCount());


        ImageView profile_pic= holder.profilePic;
        Glide.with(context).load(feedPosts.getProfilePicUrl()).into(profile_pic);

        ImageView post_pic= holder.image;
        if (feedPosts.getImgUrl()==null){
            holder.image.setVisibility(View.GONE);
        }else {
            Glide.with(context).load(feedPosts.getImgUrl()).into(post_pic);
        }

    }
    @Override
    public int getItemCount() {
        if (posts != null) {
            return posts.size();
        } else {
            return 0;
        }
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public ImageView profilePic;
        public TextView jobPosition;
        public TextView description;
        public TextView time;
        public ImageView image;

        public final TextView count;

        public ViewHolder(View view) {
            super(view);

            name = view.findViewById(R.id.user_name);
            profilePic = view.findViewById(R.id.profile_image);
            jobPosition = view.findViewById(R.id.job_post);
            description = view.findViewById(R.id.desc);
            time = view.findViewById(R.id.time_ago);
            image = view.findViewById(R.id.post_img);
            count = view.findViewById(R.id.num_likes);
        }
    }


}
