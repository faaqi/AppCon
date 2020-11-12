package com.example.appconn_telenor.recognition_level_fragments;

public class Post_Row {

    public String userName,profilePicUrl,jobPosition;

    public String description,postTime;

    String likesCount;


    public Post_Row (String user,String profilePic,String jobPost,
                       String desc,String count,String time){

        userName = user;
        profilePicUrl= profilePic;
        jobPosition = jobPost;
        description=desc;
        postTime=time;
        likesCount= count;
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
    public void setDescription (String desc){
        description=desc;
    }
    public void setLikesCount (String a){
        likesCount= a;
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

    public String getDescription() {
        return description;
    }

    public String getLikesCount() {
        return likesCount;
    }

}
