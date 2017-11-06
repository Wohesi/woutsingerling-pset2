package com.example.gebruiker.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class storyScreen extends AppCompatActivity {

    private int clickCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_screen);
    }

    public void editButton (View view) {

        EditText editText = (EditText) findViewById(R.id.editText);
        String text = editText.getText().toString();

        Intent editScreen = new Intent(this, editScreen.class);

        editScreen.putExtra("ourText", text);

        startActivity(editScreen);
    }
}



