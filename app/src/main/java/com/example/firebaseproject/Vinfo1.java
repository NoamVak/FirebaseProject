package com.example.firebaseproject;

public class Vinfo1 {

    private String loc;
    private String date;

    public Vinfo1(){}
    public Vinfo1(String loc, String date){
        this.loc=loc;
        this.date=date;
    }
    public String getLoc(){ return loc; }

    public void setLoc(String loc){ this.loc=loc; }

    public String getDate(){ return date; }

    public void setDate(String date) { this.date = date; }
}
