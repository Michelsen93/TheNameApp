package com.example.thenameapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class ViewNamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_names);
        String[] persons = {"sample", "sample2", "sample3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, persons);
        ListView lw = (ListView) findViewById(R.id.listView);

    }
    public void showImage(View view){
        //TODO LOAD PICTURE CORRESPONDING TO NAME
        CharSequence name = view.getContentDescription();
        String uri = "@drawable/" + name;
        Resources res = getResources();
        int resID = res.getIdentifier(uri , "drawable", getPackageName());
        ImageView iv = new ImageView(this);
        iv.setImageResource(resID);

        RelativeLayout.LayoutParams p = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        p.addRule(RelativeLayout.BELOW, view.getId());
        iv.setLayoutParams(p);
        RelativeLayout layout =  (RelativeLayout) findViewById(R.id.activity_view_names);
        layout.addView(iv);
    }
}
