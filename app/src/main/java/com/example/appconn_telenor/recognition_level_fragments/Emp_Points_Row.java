package com.example.appconn_telenor.recognition_level_fragments;

public class Emp_Points_Row {

    public String userName,profilePicUrl,jobPosition;

    String points;


    public Emp_Points_Row(String user,String profilePic,String jobPost,
                        String point){

        userName = user;
        profilePicUrl= profilePic;
        jobPosition = jobPost;
        points=point;
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
    public void setPoints (String point){
        points=point;
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


    public String getPoints() {
        return points;
    }



}
