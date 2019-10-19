package com.rychemrycho.app.dscgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gvGallery);
        GalleryAdapter galleryAdapter = new GalleryAdapter(this);
        galleryAdapter.setImages(images);
        gridView.setAdapter(galleryAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, ImagePreviewActivity.class);
                intent.putExtra(ImagePreviewActivity.EXTRA_IMAGE_ID, images[i]);
                intent.putExtra(ImagePreviewActivity.EXTRA_IMAGE_CAPTION, imagesCaption[i]);
                startActivity(intent);
            }
        });
    }

    private Integer[] images = {
            R.drawable.dsc_itdel_left,
            R.drawable.dsc_itdel,
            R.drawable.dsc_itdel_right,

            R.drawable.dsc_itdel_left,
            R.drawable.dsc_itdel,
            R.drawable.dsc_itdel_right,
    };

    private String[] imagesCaption = {
            "Developer Student Clubs @IT Del",
            "Developer Student Clubs Workshop",
            "Developer Student Clubs x Bitly",

            "Developer Student Clubs @IT Del",
            "Developer Student Clubs Workshop",
            "Developer Student Clubs x Bitly",
    };
}
