package com.example.reportcard;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class EnglishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_details);

        ArrayList<Assignment> assignments = new ArrayList<Assignment>();

        assignments.add(new Assignment("Assignment #1", "Assigned: 05/02/2020"));
        assignments.add(new Assignment("Assignment #2", "Assigned: 05/04/2020"));
        assignments.add(new Assignment("Assignment #3", "Assigned: 05/06/2020"));
        assignments.add(new Assignment("Assignment #4", "Assigned: 05/08/2020"));
        assignments.add(new Assignment("Assignment #5", "Assigned: 05/10/2020"));
        assignments.add(new Assignment("Assignment #6", "Assigned: 05/12/2020"));
        assignments.add(new Assignment("Assignment #7", "Assigned: 05/14/2020"));
        assignments.add(new Assignment("Assignment #8", "Assigned: 05/16/2020"));
        assignments.add(new Assignment("Assignment #9", "Assigned: 05/18/2020"));
        assignments.add(new Assignment("Assignment #10", "Assigned: 05/20/2020"));
        assignments.add(new Assignment("Assignment #11", "Assigned: 05/22/2020"));
        assignments.add(new Assignment("Assignment #12", "Assigned: 05/24/2020"));

        AssignmentAdapter adapter = new AssignmentAdapter(this,assignments);

        ListView assignmentListView = (ListView) findViewById(R.id.assignment_list);

        assignmentListView.setAdapter(adapter);
    }


}
