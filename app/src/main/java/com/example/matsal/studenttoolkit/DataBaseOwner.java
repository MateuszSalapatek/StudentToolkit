package com.example.matsal.studenttoolkit;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseOwner extends SQLiteOpenHelper {


    public DataBaseOwner(Context context){
        super (context, "StudentToolkit.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table SubjectAdditional (" +
                "id integer primary key autoincrement," +
                "subject text);" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
