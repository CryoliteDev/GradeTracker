package com.example.reportcard;

public class Course {

    //Variables
    private String courseName;
    private String courseID;

    //Constructor
    public Course(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
    }

    //Getter
    public String getCourseName() {
        return courseName;
    }
    public String getCourseID() {
        return courseID;
    }

    //Setter
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

}
