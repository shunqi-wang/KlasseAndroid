package com.example.asus.klasseandroid;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.security.AccessController.getContext;

public class InstructorAnnounce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructor_announce);
       final EditText e=findViewById(R.id.announcetext);

        Button b=findViewById(R.id.postannounce);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Database DBHelper=new Database(getApplicationContext());
                SQLiteDatabase db = DBHelper.getWritableDatabase();

                ContentValues values = new ContentValues();

                values.put("content", e.getText().toString());
                e.setText("");

                db.insert("announcement", null, values);

                db.close();

            }
        });

    }
}
