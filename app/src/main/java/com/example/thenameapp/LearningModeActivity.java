package com.example.thenameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LearningModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_mode);
        //TODO - Create pictures view with all pictures from bundle
        //TODO - Add imput field to each picture
        //TODO - Add home navigation
    }
    public void checkAnswer(View view){
        //TODO - Check if name matches picture
        //TODO - Track score
        //TODO - Load score to bundle
        //TODO - Add logic to navigate to score screen when finished
    }
}
