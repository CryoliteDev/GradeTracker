package com.example.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course);

        final ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(new Course("English",001));
        courses.add(new Course("Spanish",002));

        final CourseAdapter adapter = new CourseAdapter(this,courses);

        final ListView courseListView = (ListView) findViewById(R.id.course_list);

        courseListView.setAdapter(adapter);

        /**
         * Intent for Courses
         */
        courseListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                int unitID = adapter.getItem(position).getUnitID();

                if (unitID == 001) {
                    Intent engIntent = new Intent(MainActivity.this, EnglishActivity.class);
                    startActivity(engIntent);
                } else if (unitID == 002) {
                    Intent spanIntent = new Intent(MainActivity.this, SpanishActivity.class);
                    startActivity(spanIntent);
                }
            }
        });
    }
}