package com.rychemrycho.app.dscgallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GalleryAdapter extends BaseAdapter {
    private Context mContext;

    public GalleryAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return idImages.length;
    }

    @Override
    public Object getItem(int i) {
        return idImages[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (view == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(350, 350));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) view;
        }
        imageView.setImageResource(idImages[i]);
        return imageView;
    }

    private Integer[] idImages = {
            R.drawable.dsc_itdel_left,
            R.drawable.dsc_itdel,
            R.drawable.dsc_itdel_right,

            R.drawable.dsc_itdel_left,
            R.drawable.dsc_itdel,
            R.drawable.dsc_itdel_right,

            R.drawable.dsc_itdel_left,
            R.drawable.dsc_itdel,
            R.drawable.dsc_itdel_right,

            R.drawable.dsc_itdel_left,
            R.drawable.dsc_itdel,
            R.drawable.dsc_itdel_right,

            R.drawable.dsc_itdel_left,
            R.drawable.dsc_itdel,
            R.drawable.dsc_itdel_right,

            R.drawable.dsc_itdel_left,
            R.drawable.dsc_itdel,
            R.drawable.dsc_itdel_right,

            R.drawable.dsc_itdel_left,
            R.drawable.dsc_itdel,
            R.drawable.dsc_itdel_right,
    };
}
