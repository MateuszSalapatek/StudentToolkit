package com.example.matsal.studenttoolkit;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayAdapterCustom extends ArrayAdapter {

    public ArrayAdapterCustom(Context context, ArrayList<Lesson> lessons) {
        super(context, 0, lessons);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Lesson l = (Lesson) getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.lesson, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvLessonName);
        TextView tvHome = (TextView) convertView.findViewById(R.id.tvLessonTeacher);
        // Populate the data into the template view using the data object
        tvName.setText(l.getLessonName());
        tvHome.setText(l.getLessonTeacher());
        // Return the completed view to render on screen
        return convertView;
    }
}
