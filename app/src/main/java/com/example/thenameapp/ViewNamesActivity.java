package com.example.thenameapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class ViewNamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_names);
        //TODO - Load names from bundle.
        //TODO - Add home navigation
        String[] names = {"sample", "sample2", "sample3"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, names);
        ListView lw = (ListView) findViewById(R.id.listView);
        lw.setAdapter(adapter);
        lw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {

                String uri = "@drawable/" + parent.getItemAtPosition(position);
                Resources res = getResources();
                int resID = res.getIdentifier(uri , "drawable", getPackageName());
                ImageView iv = (ImageView)findViewById(R.id.imageLoad);
                Bitmap pic = BitmapFactory.decodeResource(getResources(), resID);
                int nh = (int) ( pic.getHeight() * (512.0 / pic.getWidth()) );

                Bitmap scaled = Bitmap.createScaledBitmap(pic, 512, nh, true);
                iv.setImageBitmap(scaled);

            }
        });

    }

}
