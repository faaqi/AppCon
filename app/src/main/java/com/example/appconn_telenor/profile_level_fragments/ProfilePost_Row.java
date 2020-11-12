package com.example.appconn_telenor.profile_level_fragments;

public class ProfilePost_Row {

    public String userName,profilePicUrl,jobPosition;

    public String description,imgUrl,postTime;

    String likesCount;


    public ProfilePost_Row(String user, String profilePic, String jobPost,
                           String desc,String img, String count, String time){

        userName = user;
        profilePicUrl= profilePic;
        jobPosition = jobPost;
        description=desc;
        postTime=time;
        imgUrl=img;
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
    public void setImgUrl (String img){
        imgUrl=img;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public String getLikesCount() {
        return likesCount;
    }

}
