package com.example.appconn_telenor.chat_level_fragments;

import com.example.appconn_telenor.R;

public class Contact_Row {

    public String userName,profilePicUrl,jobPosition;

    public String postTime;



    public Contact_Row (String user,String profilePic,String jobPost,String time){

        userName = user;
        profilePicUrl= profilePic;
        jobPosition = jobPost;

        postTime=time;

    }


    public  void setUserName(String a){
        userName=a;
    }
    public void  setProfilePicUrl(String url){
        profilePicUrl=url;
    }
    public  void setJobPosition (String job){
        jobPosition=job;
    }

    public  void setPostTime (String t){
        postTime = t;
    }


    public String getUserName() {
        return userName;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public String getPostTime() {
        return postTime;
    }


}
