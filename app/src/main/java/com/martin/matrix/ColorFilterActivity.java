package com.martin.matrix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ColorFilterActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_filter);
        imageView = (ImageView) findViewById(R.id.imageView);
        ColorFilter.setColorFilter(imageView, ColorFilter.colormatrix_heibai);
    }
}
