package com.example.reportcard;

public class Assignment {

    //Variables
    private String assignmentName;
    private String assignmentDueDate;

    //Constructor
    public Assignment(String assignmentName, String assignmentDueDate) {
        this.assignmentName = assignmentName;
        this.assignmentDueDate = assignmentDueDate;
    }


    /**
     * GETTERS
     * @returns Assignment Name and it's Due Date
     */
    public String getAssignmentName() {
        return assignmentName;
    }

    public String getAssignmentDueDate() {
        return assignmentDueDate;
    }
}
