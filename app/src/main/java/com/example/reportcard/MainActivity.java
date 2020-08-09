package com.example.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course);

        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(new Course("English","english"));
        courses.add(new Course("Spanish","spanish"));
        courses.add(new Course("Global Studies","history"));

        CourseAdapter adapter = new CourseAdapter(this,courses);

        ListView courseListView = (ListView) findViewById(R.id.course_list);

        courseListView.setAdapter(adapter);

        /**
         * Intent for English Course
         */
        TextView english = (TextView) findViewById(R.id.english);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent engIntent = new Intent(MainActivity.this, EnglishActivity.class);
                startActivity(engIntent);
            }
        });
    }
}