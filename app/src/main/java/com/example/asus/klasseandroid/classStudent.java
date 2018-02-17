package com.example.asus.klasseandroid;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class classStudent extends AppCompatActivity {
    Button chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_student);
        chat= findViewById(R.id.chatbutton);

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startChat();
            }
        });


    }
    public void startChat()
    {
        Intent launch = new Intent(this, ChatRoom.class);
        startActivity(launch);
    }
    }

