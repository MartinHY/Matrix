package com.martin.matrix;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;

public class MatrixDistortionActivity extends AppCompatActivity {

    ImageView imageView, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix2);
        imageView = (ImageView) findViewById(R.id.img);
        imageView.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix()));
        imageView2 = (ImageView) findViewById(R.id.img2);
        Glide.with(this).load(R.mipmap.test).into(imageView);
        Glide.with(this).load(R.mipmap.test).asBitmap().into(new SimpleTarget<Bitmap>() {
            @Override
            public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                Bitmap bitmap = BitmapUtils.rotate(resource, 190, false);
                imageView2.setImageBitmap(bitmap);
            }
        });
    }
}
