package com.example.gebruiker.madlibs;

import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    AssetManager am = context.getAssets();
    InputStream story = am.open("madlib1_tarzan.txt");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getStarted (View view) {
        Intent storyScreen = new Intent(this, storyScreen.class);
        startActivity(storyScreen);
        finish();
    }
}

