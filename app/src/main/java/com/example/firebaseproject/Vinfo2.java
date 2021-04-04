package com.example.firebaseproject;

public class Vinfo2 {
    private String date;
    private String loc;

    public Vinfo2(){}
    public Vinfo2(String date, String loc){
        this.date=date;
        this.loc=loc;
    }

    public String getLoc(){ return loc; }

    public void setLoc(String loc){ this.loc=loc; }

    public String getDate(){ return date; }

    public void setDate(String date) { this.date = date; }
}
