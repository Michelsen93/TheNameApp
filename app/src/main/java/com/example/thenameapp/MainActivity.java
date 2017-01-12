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
     *
     * @param view
     */
    public void viewNames(View view){
        //TODO
        //Go to viewNames activity
    }
    public void viewPictures(View view){
        //TODO
        //Go to viewPictures activity
    }
    public void learningMode(View view){
        //TODO
        //Go to learningMode activity
    }
}
