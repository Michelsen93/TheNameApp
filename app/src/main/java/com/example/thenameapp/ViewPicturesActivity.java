package com.example.thenameapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.InputStream;

public class ViewPicturesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i =0;

        setContentView(R.layout.activity_view_pictures);

    }
    public void showText(View view){
        CharSequence name = view.getContentDescription();
        TextView text = new TextView(this);
        text.setText(name);
        RelativeLayout.LayoutParams p = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        p.addRule(RelativeLayout.BELOW, view.getId());
        text.setLayoutParams(p);
        RelativeLayout layout =  (RelativeLayout) findViewById(R.id.activity_view_pictures);
        layout.addView(text);
    }
}
