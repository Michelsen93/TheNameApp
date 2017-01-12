package com.example.thenameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = 0;

        setContentView(R.layout.activity_main);
    }

    /**
     * Launches addperson activity
     * @param view
     */
    public void viewAddPerson(View view){
        Intent intent = new Intent(this, AddPersonActivity.class);
        startActivity(intent);
    }

    /**
     * Launches viewNames activity
     * @param view
     */
    public void viewNames(View view){
        Intent intent = new Intent(this, ViewNamesActivity.class);
        startActivity(intent);
    }
    /**
     * Launches viewPictures activity
     * @param view
     */
    public void viewPictures(View view){
        Intent intent = new Intent(this, ViewPicturesActivity.class);
        startActivity(intent);
    }
    /**
     * Launches learningMode activity
     * @param view
     */
    public void viewLearningMode(View view){
        Intent intent = new Intent(this, LearningModeActivity.class);
        startActivity(intent);
    }
}
