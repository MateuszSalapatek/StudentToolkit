package com.example.matsal.studenttoolkit;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.matsal.studenttoolkit.ArrayAdapterCustom;
import com.example.matsal.studenttoolkit.Lesson;
import com.example.matsal.studenttoolkit.R;

import java.util.ArrayList;

public class MondayFragLayout extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_monday_frag_layout, container, false);

        ArrayList<Lesson> arrayOfLessons = new ArrayList<Lesson>();
        Lesson l = new Lesson("j.angielski","DUPA");
        arrayOfLessons.add(l);
        Lesson l2 = new Lesson("matematyka","CYCKI");
        arrayOfLessons.add(l2);
        Lesson l3 = new Lesson("geografia","CYCKI");
        arrayOfLessons.add(l3);
        Lesson l4 = new Lesson("j.niemiecki","CYCKI");
        arrayOfLessons.add(l4);
        Lesson l5 = new Lesson("historia","CYCKI");
        arrayOfLessons.add(l5);
        Lesson l6 = new Lesson("informatyka","CYCKI");
        arrayOfLessons.add(l6);

        ArrayAdapterCustom adapter = new ArrayAdapterCustom(getContext(), arrayOfLessons);

        ListView listView = view.findViewById(R.id.lVLessons); // when I want to use findViewById in Fragment I have to create view
        listView.setAdapter(adapter);

        return view;
    }
}
