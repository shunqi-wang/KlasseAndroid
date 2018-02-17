package com.example.asus.klasseandroid;

import android.provider.BaseColumns;

/**
 * Created by harleen on 18/2/18.
 * This is a container for constants that define names
 * for URIs, tables and columns
 * This lets us change the column name in one place
 * and have it propograte throughout the code
 */

public final class DatabaseContractClass {
    //to prevent someone from accidentally instantiating the contract
    //make the constructor private
    private DatabaseContractClass(){}

    //Inner class that defines the table contents
    public static class DatabaseEntry implements BaseColumns {
        public static final String TABLE_NAME = "studentAuth";
        public static final String _ID = "id";
        public static final String STUDENT_ID = "student_id";
        public static final String USERNAME = "username";
        public static final String EMAIL_ID = "email_id";
        public static final String USER_ID = "user_id";
        public static final String PASSWORD = "password";

    }

    //now we gotta implement methods that create and maintain the database and tables

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + DatabaseEntry.TABLE_NAME + " (" +
                    DatabaseEntry._ID + " INTEGER PRIMARY KEY," +
                    DatabaseEntry.STUDENT_ID + " INTEGER," +
                    DatabaseEntry.USERNAME + " TEXT," +
                    DatabaseEntry.EMAIL_ID + " TEXT," +
                    DatabaseEntry.USER_ID + " TEXT," +
                    DatabaseEntry.PASSWORD + " TEXT)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + DatabaseEntry.TABLE_NAME;
}
