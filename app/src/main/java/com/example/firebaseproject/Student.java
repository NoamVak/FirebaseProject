package com.example.firebaseproject;

public class Student {
    private int GradeClass;
    private int StuClass;
    private String StuName;
    private Vinfo1 Vac1;
    private Vinfo2 Vac2;

    public Student(){}
    public Student ( String StuName,int GradeClass, int StuClass,Vinfo1 Vac1, Vinfo2 Vac2) {
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

    public Vinfo1 getVac1(){return Vac1;}

    public void setVac1(Vinfo1 Vac1){this.Vac1=Vac1;}

    public Vinfo2 getVac2(){return Vac2;}

    public void setVac2(Vinfo2 Vac2){this.Vac2=Vac2;}

}
