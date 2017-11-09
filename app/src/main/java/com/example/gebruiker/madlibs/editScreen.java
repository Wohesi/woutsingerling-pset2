package com.example.gebruiker.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class editScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_screen);

        Intent intent = getIntent();
        String recievedText = intent.getStringExtra("story");

        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(recievedText);


    }


    public void newStoryButton (View view) {
        Intent main = new Intent(this, MainActivity.class);

        // use clear from story.java

        startActivity(main);
        finish();


    }
}



