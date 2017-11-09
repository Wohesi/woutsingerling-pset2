package com.example.gebruiker.madlibs;

import android.content.Intent;
import android.content.res.AssetManager;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private InputStream is;
    private Story story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        Button selectedStory = (Button) view;
        switch(selectedStory.getId()) {
            case R.id.tarzan:
                try {
                    is = getAssets().open("madlib1_tarzan.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                story = new Story(is);
                break;
            case R.id.university:
                try {
                    is = getAssets().open("madlib2_university.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                story = new Story(is);
                break;
            case R.id.clothes:
                try {
                    is = getAssets().open("madlib3_clothes.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                story = new Story(is);
                break;
            case R.id.dance:
                try {
                    is = getAssets().open("madlib4_dance.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                story = new Story(is);
                break;
        }

        Intent storyScreen = new Intent(this, storyScreen.class);
        storyScreen.putExtra("story",story);
        startActivity(storyScreen);
        finish();
    }

    /*
    public void tarzan (View view) {
        Intent storyScreen = new Intent(this, storyScreen.class);

        storyScreen.putExtra("story1",story1);

        startActivity(storyScreen);
        finish();
    }

    public void university(View view) {
        Intent storyScreen = new Intent(this, storyScreen.class);
        storyScreen.putExtra("story2",story2);
    }
    */
}

