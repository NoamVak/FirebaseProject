package com.example.firebaseproject;

public class vaccineInfo {

    private String loc;
    private int date;

    public vaccineInfo(){}
    public vaccineInfo(String loc,int date){
        this.loc=loc;
        this.date=date;
    }
    public String getLoc(){ return loc; }

    public void setLoc(String loc){ this.loc=loc; }

    public int getDate(){ return date; }

    public void setDate(int date) { this.date = date; }
}
