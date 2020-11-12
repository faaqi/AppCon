package com.example.appconn_telenor.chat_level_fragments;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.appconn_telenor.CheersFeed;
import com.example.appconn_telenor.R;

import java.util.ArrayList;

public class ChatMsgAdapter extends RecyclerView.Adapter<ChatMsgAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Contact_Row> msgzFrom;

    public ChatMsgAdapter(Context context, ArrayList<Contact_Row> arrayList) {
        this.context = context;
        this.msgzFrom = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.chat_message, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Contact_Row msgFrom = msgzFrom.get(position);

        TextView user_name= holder.name;
        user_name.setText(msgFrom.getUserName());

        TextView user_job= holder.jobPosition;
        user_job.setText(msgFrom.getJobPosition());

        TextView time_ago= holder.time;
        time_ago.setText(msgFrom.getPostTime());

        ImageView profile_pic= holder.profilePic;
        Glide.with(context).load(msgFrom.getProfilePicUrl()).into(profile_pic);

    }

    @Override
    public int getItemCount() {
        return msgzFrom.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView profilePic;
        public TextView jobPosition;
        public TextView time;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.msg_from_username);
            profilePic = itemView.findViewById(R.id.msg_from_pic);
            jobPosition = itemView.findViewById(R.id.msg_from_job);
            time = itemView.findViewById(R.id.msg_time_ago);

        }
    }
}