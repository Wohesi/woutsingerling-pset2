package com.example.gebruiker.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class storyScreen extends AppCompatActivity {

    Story currentStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_screen);

        Intent intent = getIntent();
        currentStory = (Story) intent.getSerializableExtra("story1");

    }

    public void editButton (View view) {

        //currentStory.getNextPlaceholder();

        //getPlaceholderCount
        //currentStory.getPlaceholderCount();


        //getPlaceholderRemainingCount
        //currentStory.getPlaceholderRemainingCount();

        //isFilledIn --> if true all placeholders are filled in.


        EditText editText = (EditText) findViewById(R.id.editText);
        String text = editText.getText().toString();

        //fillInPlaceholder
        currentStory.fillInPlaceholder(text);

        //getNextPlaceholder
        currentStory.getNextPlaceholder();



        Intent editScreen = new Intent(this, editScreen.class);
        editScreen.putExtra("ourText", text);

        startActivity(editScreen);
    }
}



