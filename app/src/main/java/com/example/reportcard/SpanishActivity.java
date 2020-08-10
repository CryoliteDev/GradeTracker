package com.example.reportcard;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SpanishActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_details);

        ArrayList<Assignment> assignments = new ArrayList<Assignment>();

        assignments.add(new Assignment("Assignment #14", "Assigned: 05/02/2020"));
        assignments.add(new Assignment("Assignment #18", "Assigned: 05/14/2020"));
        assignments.add(new Assignment("Assignment #19", "Assigned: 05/26/2020"));

        AssignmentAdapter adapter = new AssignmentAdapter(this,assignments);

        ListView assignmentListView = (ListView) findViewById(R.id.assignment_list);
        assignmentListView.setAdapter(adapter);
    }
}
