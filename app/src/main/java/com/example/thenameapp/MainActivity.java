package com.example.thenameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = 0;
        //TODO load names into bundle

        setContentView(R.layout.activity_main);
    }
    protected static Bundle bundleHelper(Intent intent){
        Bundle bundle = new Bundle();
        if(!intent.hasExtra("names")) {
            ArrayList<String> names = new ArrayList<String>();
            names.add("sample");
            names.add("sample2");
            names.add("sample3");
            bundle.putStringArrayList("names", names);
        }else{
            bundle.putStringArrayList("names", intent.getStringArrayListExtra("names"));
        }
        return bundle;
    }

    /**
     * Launches addperson activity
     * @param view
     */
    public void viewAddPerson(View view){
        Intent intent = new Intent(this, AddPersonActivity.class);
        Bundle bundle = bundleHelper(getIntent());
        intent.putExtra("names", bundle);
        startActivity(intent);
    }

    /**
     * Launches viewNames activity
     * @param view
     */
    public void viewNames(View view){
        Intent intent = new Intent(this, ViewNamesActivity.class);
        Bundle bundle = bundleHelper(getIntent());
        intent.putExtra("names", bundle);
        startActivity(intent);
    }
    /**
     * Launches viewPictures activity
     * @param view
     */
    public void viewPictures(View view){
        Intent intent = new Intent(this, ViewPicturesActivity.class);
        Bundle bundle = bundleHelper(getIntent());
        intent.putExtra("names", bundle);
        startActivity(intent);
    }
    /**
     * Launches learningMode activity
     * @param view
     */
    public void viewLearningMode(View view){
        Intent intent = new Intent(this, LearningModeActivity.class);
        Bundle bundle = bundleHelper(getIntent());
        intent.putExtra("names", bundle);
        startActivity(intent);
    }
}
