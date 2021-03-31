package com.example.firebaseproject;

public class Vinfo2 {
    private int date;
    private String loc;

    public Vinfo2(){}
    public Vinfo2(int date, String loc){
        this.date=date;
        this.loc=loc;
    }

    public String getLoc(){ return loc; }

    public void setLoc(String loc){ this.loc=loc; }

    public int getDate(){ return date; }

    public void setDate(int date) { this.date = date; }
}
