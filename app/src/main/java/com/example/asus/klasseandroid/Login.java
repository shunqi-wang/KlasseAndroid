package com.example.asus.klasseandroid;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.klasseandroid.R;


import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class Login extends AppCompatActivity{

    EditText id;
    EditText pw;
    String type;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
        Intent i=getIntent();
        Bundle b=i.getExtras();
        if(b!=null)
        {
            type=b.getString("type");
        }
        Button login=findViewById(R.id.signin);
        id=findViewById(R.id.userId);
        pw=findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(id.getText().toString().equals("100") && (pw.getText().toString().equals("abc123")))
                {
                    if(type.equals("student"))
                        startStudent();
                    else
                        startInstructor();

                }
                else
               {
                   Toast.makeText(getApplicationContext(),"Wrong credentials",Toast.LENGTH_SHORT).show();
                   id.setText("");
                   pw.setText("");

               }

            }
        });

    }
    public void startStudent()
    {
        Intent launch = new Intent(this, studentMain.class);
        startActivity(launch);
    }
    public void startInstructor()
    {
        Intent launch = new Intent(this, instructorMain.class);
        startActivity(launch);
    }
}