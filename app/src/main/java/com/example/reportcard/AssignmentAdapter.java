package com.example.reportcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AssignmentAdapter extends ArrayAdapter<Assignment> {
    public AssignmentAdapter(Context context, ArrayList<Assignment> assignments) {
        super(context, 0, assignments);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_assignment,parent,false);
        }

        Assignment currentAssignment = getItem(position);

        //assignment name text view in list_assignment
        TextView assignmentTextView = (TextView) listItemView.findViewById(R.id.assignment_text_view);
        assignmentTextView.setText(currentAssignment.getAssignmentName());

        //due_date_text_view in list_assignment
        TextView dueDateTextView = (TextView) listItemView.findViewById(R.id.due_date_text_view);
        dueDateTextView.setText(currentAssignment.getAssignmentDueDate());

        return listItemView;
    }
}
