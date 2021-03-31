package com.example.firebaseproject;

public class Student {
    private int GradeClass;
    private int StuClass;
    private String StuName;
    private Vinfo1 Vac1;
    private Vinfo2 Vac2;

    public Student(){}
    public Student (int GradeClass, int StuClass, String StuName, Vinfo1 Vac1, Vinfo2 Vac2) {
        this.GradeClass=GradeClass;
        this.StuClass=StuClass;
        this.StuName=StuName;
        this.Vac1=Vac1;
        this.Vac2=Vac2;
    }
    public int getGradeClass(){return GradeClass;}

    public void setGradeClass(int GradeClass){this.GradeClass=GradeClass;}

    public int getStuClass(){return StuClass;}

    public void setStuClass(int StuClass){this.StuClass=StuClass;}

    public String getStuName(){return StuName;}

    public void setStuName(String StuName){this.StuName=StuName;}


}
