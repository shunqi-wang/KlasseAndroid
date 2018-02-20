package com.example.asus.klasseandroid;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentAnnounce extends AppCompatActivity {
    private Database mHelper;
    private SQLiteDatabase dataBase;

    private ArrayList<String> content = new ArrayList<String>();

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_announce);
        list=findViewById(R.id.list_of_announcements);
        mHelper=new Database(this);
        dataBase = mHelper.getWritableDatabase();
        Cursor mCursor = dataBase.rawQuery("SELECT * FROM " +"announcement", null);

        content.clear();

        if (mCursor.moveToFirst()) {
            do {
               content.add(mCursor.getString(0));


            } while (mCursor.moveToNext());
        }
        DisplayAdapter disadpt = new DisplayAdapter(StudentAnnounce.this,content);
        list.setAdapter(disadpt);
        mCursor.close();

    }

}
