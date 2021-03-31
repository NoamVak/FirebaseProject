package com.example.firebaseproject;

public class Vinfo1 {

    private String loc;
    private int date;

    public Vinfo1(){}
    public Vinfo1(String loc, int date){
        this.loc=loc;
        this.date=date;
    }
    public String getLoc(){ return loc; }

    public void setLoc(String loc){ this.loc=loc; }

    public int getDate(){ return date; }

    public void setDate(int date) { this.date = date; }
}
