package com.martin.matrix;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_base).setOnClickListener(this);
        findViewById(R.id.bt_distortion).setOnClickListener(this);
        findViewById(R.id.bt_color_matrix).setOnClickListener(this);
        findViewById(R.id.bt_color_hue).setOnClickListener(this);
        findViewById(R.id.bt_color_filter).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.bt_base:
                intent.setClass(MainActivity.this, MatrixBaseActivity.class);
                break;
            case R.id.bt_distortion:
                intent.setClass(MainActivity.this, MatrixDistortionActivity.class);
                break;
            case R.id.bt_color_hue:
                intent.setClass(MainActivity.this, ColorHueActivity.class);
                break;
            case R.id.bt_color_matrix:
                intent.setClass(MainActivity.this, ColorMatrixActivity.class);
                break;
            case R.id.bt_color_filter:
                intent.setClass(MainActivity.this, ColorFilterActivity.class);
                break;
        }
        MainActivity.this.startActivity(intent);
    }
}
