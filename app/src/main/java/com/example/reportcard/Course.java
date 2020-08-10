package com.example.reportcard;

public class Course {

    //Variables
    private String courseName;
    private int unitID;

    //Constructor
    public Course(String courseName, int unitID) {
        this.courseName = courseName;
        this.unitID = unitID;
    }
    //Getter and Setters
    public String getCourseName() {
        return courseName;
    }
    public int getUnitID() {
        return unitID;
    }

    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }
}