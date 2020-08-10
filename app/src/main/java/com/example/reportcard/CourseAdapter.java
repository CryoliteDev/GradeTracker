package com.example.reportcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CourseAdapter extends ArrayAdapter<Course> {
    public CourseAdapter(Context context, ArrayList<Course> courses) {
        super(context, 0, courses);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.course_list,parent,false);
        }

        Course currentCourse = getItem(position);

        TextView courseTextView = (TextView) listItemView.findViewById(R.id.course_name);
        courseTextView.setText(currentCourse.getCourseName());
        currentCourse.setUnitID(currentCourse.getUnitID());

        return listItemView;
    }
}