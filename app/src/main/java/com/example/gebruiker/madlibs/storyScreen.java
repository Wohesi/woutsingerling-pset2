package com.example.gebruiker.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class storyScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_screen);

        Intent story = getIntent();
        Story currentStory = story.getIntent("story1");

    }

    public void editButton (View view) {

        //fillInPlaceholder

        //getNextPlaceholder

        //getPlaceholderCount

        //getPlaceholderRemainingCount

        //isFilledIn --> if true all placeholders are filled in.


        EditText editText = (EditText) findViewById(R.id.editText);
        String text = editText.getText().toString();

        Intent editScreen = new Intent(this, editScreen.class);
        editScreen.putExtra("ourText", text);
        startActivity(editScreen);
    }
}



