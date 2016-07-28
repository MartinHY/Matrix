package com.martin.matrix;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;

public class MainActivity extends AppCompatActivity {
    ImageView imageView, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.img);
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
