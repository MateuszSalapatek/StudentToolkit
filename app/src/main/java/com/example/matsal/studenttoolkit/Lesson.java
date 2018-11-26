package com.example.matsal.studenttoolkit;

import java.util.ArrayList;

public class Lesson {
    private String lessonName;
    private String lessonTeacher;


    public Lesson(String lessonName, String lessonTeacher) {

        this.lessonName = lessonName;
        this.lessonTeacher = lessonTeacher;
    }

    public void setLessonTeacher(String lessonTeacher) {
        this.lessonTeacher = lessonTeacher;
    }

    public String getLessonTeacher() {

        return lessonTeacher;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {

        return lessonName;
    }

    public Lesson(String lessonName) {

        this.lessonName = lessonName;
    }

    public ArrayList<String> getListOfSubjects(){
        ArrayList<String> subjects = new ArrayList<>();

        //filling the subjects
            subjects.add(String.valueOf(R.string.subjectBiology));
            subjects.add(String.valueOf(R.string.subjectArt));
            subjects.add(String.valueOf(R.string.subjectChemistry));
            subjects.add(String.valueOf(R.string.subjectEnglish));
            subjects.add(String.valueOf(R.string.subjectFrench));
            subjects.add(String.valueOf(R.string.subjectGerman));
            subjects.add(String.valueOf(R.string.subjectItalian));
            subjects.add(String.valueOf(R.string.subjectGeography));
            subjects.add(String.valueOf(R.string.subjectIT));
            subjects.add(String.valueOf(R.string.subjectHistory));
            subjects.add(String.valueOf(R.string.subjectMathematics));
            subjects.add(String.valueOf(R.string.subjectMusic));
            subjects.add(String.valueOf(R.string.subjectPE));
            subjects.add(String.valueOf(R.string.subjectPhysics));
            subjects.add(String.valueOf(R.string.subjectReligious));
            subjects.add(String.valueOf(R.string.subjectScience));
        //
        return subjects;
    }
}
