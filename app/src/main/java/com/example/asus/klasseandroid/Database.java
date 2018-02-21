package com.example.asus.klasseandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "Announcements";

    // Contacts table name
    private static final String TABLE_Name= "announcement";

    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_CONTENT = "content";

    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String createTable= "CREATE TABLE " + TABLE_Name+" ("
                +KEY_CONTENT+ " TEXT );";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_Name);

        // Create tables again
        onCreate(db);
    }
    public void clearDatabase(SQLiteDatabase db,String name) {
        db.execSQL("DROP TABLE IF EXISTS " + name);

        // Create tables again
        onCreate(db);
    }

}
