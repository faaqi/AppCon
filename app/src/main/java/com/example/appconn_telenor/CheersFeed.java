package com.example.appconn_telenor;

public class CheersFeed {

    public String userName,profilePicUrl,jobPosition;

    public String description,imgUrl,postTime;

    String cheersCount;


    public CheersFeed (String user,String profilePic,String jobPost,
                String desc, String postImg,String count,String time){

        userName = user;
        profilePicUrl= profilePic;
        jobPosition = jobPost;
        description=desc;
        imgUrl = postImg;
        postTime=time;

        cheersCount= count;
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
    public void setImgUrl (String a){
        imgUrl= a;
    }
    public  void setPostTime (String t){
        postTime = t;
    }
    public  void setCheersCount (String a){
        cheersCount=a;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public String getPostTime() {
        return postTime;
    }

    public String getDescription() {
        return description;
    }

    public String getCheersCount() {
        return cheersCount;
    }

}
