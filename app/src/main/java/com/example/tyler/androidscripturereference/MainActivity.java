package com.example.tyler.androidscripturereference;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

//I collaborated with Josh Uchytil and Michael Huff
//Both helped me a lot to know what to do with my code

//Main Reference: https://developer.android.com/training/basics/firstapp/starting-activity.html

public class MainActivity extends AppCompatActivity {
    //I have no idea what this is doing. Michale told me what to put in the quotes
    //but it really confuses me.
    public final static String EXTRA_MESSAGE = "com.example.tyler.androidscripturereference.MESSAGE";
    private String scripture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void share(View view) {
        try {
            //define the EditText objects
            EditText bookText = (EditText) findViewById(R.id.bookText);
            EditText chapterText = (EditText) findViewById(R.id.chapterText);
            EditText verseText = (EditText) findViewById(R.id.verseText);
            //create an intent to pass to shareScreen
            Intent intent = new Intent(this, ShareScreen.class);
            //Concatenate the text

                String scripture = bookText.getText().toString() + " " +
                        chapterText.getText().toString() + ":" +
                        verseText.getText().toString();

            intent.putExtra(EXTRA_MESSAGE, scripture);
            startActivity(intent);
        }

        catch (Exception exception) {
        //I should do something here but I am not sure how yet
        }
    }
}
