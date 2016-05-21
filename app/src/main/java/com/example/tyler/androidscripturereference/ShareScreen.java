package com.example.tyler.androidscripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class ShareScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_screen);
        //get the intent
        Intent intent = getIntent();
        //find the scriptureDisplay view
        TextView scriptureText = (TextView) findViewById(R.id.scriptureDisplay);
        //get the string from the intent
        //Michael suggested to catch this by checking if NULL
        if (scriptureText != null) {
            scriptureText.setText(intent.getStringExtra(MainActivity.EXTRA_MESSAGE));
        }
    }
}
