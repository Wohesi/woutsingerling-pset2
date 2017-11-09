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
        currentStory = (Story) intent.getSerializableExtra("story");

        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setHint(currentStory.getNextPlaceholder());
    }

    public void editButton (View view) {

        EditText editText = (EditText) findViewById(R.id.editText);
        String text = editText.getText().toString();

        //fillInPlaceholder
        currentStory.fillInPlaceholder(text);

        editText.setText("");
        editText.setHint(currentStory.getNextPlaceholder());

        //if true all placeholders are filled in, and the story can be made.
        if (currentStory.isFilledIn()) {
            Intent intent = new Intent(this, editScreen.class);
            intent.putExtra("story", currentStory.toString());
            startActivity(intent);
            finish();
        }
    }
    /*
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("word", editText.getText());
    }

    @Override
    protected void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);
        editText.setText(inState.getText("word"));

    }
    */
}



