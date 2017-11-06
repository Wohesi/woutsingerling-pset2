package com.example.gebruiker.madlibs;

import android.content.Intent;
import android.content.res.AssetManager;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        try {
            is = getAssets().open("madlib1_tarzan.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Story story1 = new Story(is);

    }

    public void getStarted (View view) {
        Intent storyScreen = new Intent(this, storyScreen.class);

        storyScreen.putExtra("story1",story);

        startActivity(storyScreen);
        finish();
    }
}

