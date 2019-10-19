package com.rychemrycho.app.dscgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ImagePreviewActivity extends AppCompatActivity {
    public static String EXTRA_IMAGE_ID = "extra-image-id";
    public static String EXTRA_IMAGE_CAPTION = "extra-image-caption";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_preview);

        int imageId = getIntent().getIntExtra(EXTRA_IMAGE_ID, 0);
        String imageCaption = getIntent().getStringExtra(EXTRA_IMAGE_CAPTION);

        ImageView imageView = findViewById(R.id.ivImageContainer);
        TextView textView = findViewById(R.id.tvImageCaption);

        imageView.setImageDrawable(getResources().getDrawable(imageId, getApplicationContext().getTheme()));
        textView.setText(imageCaption);
    }
}
