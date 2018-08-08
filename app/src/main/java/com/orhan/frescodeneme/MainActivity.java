package com.orhan.frescodeneme;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.fresco_layout);

        SimpleDraweeView draweeView = findViewById(R.id.my_image_view);
        final Uri imageUri = Uri.parse("https://lh3.googleusercontent.com/-voUmhKJzNHc/VSJaPfSJ2pI/AAAAAAAABKw/-oFVzRZxI40/w140-h105-p/fresh_green_grass_bokeh-wallpaper-1024x768.jpg");
        draweeView.setImageURI(imageUri);
    }
}
