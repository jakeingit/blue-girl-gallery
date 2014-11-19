package com.jakegosskuehn.basicgallery;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;

public class GalleryImageAdapter extends BaseAdapter 
{
    private Context mContext;

    private Integer[] mImageIds = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10,
            R.drawable.image11,
            R.drawable.image12,
            R.drawable.image13,
            R.drawable.image14,
            R.drawable.image15,
            R.drawable.image16,
            R.drawable.image17,
            R.drawable.image18,
            R.drawable.image19,
            R.drawable.image20,
            R.drawable.image21,
            R.drawable.image22,
            R.drawable.image23,
            R.drawable.image24,
            R.drawable.image25,
            R.drawable.image26,
            R.drawable.image27,
            R.drawable.image28,
            R.drawable.image29,
            R.drawable.image30,
            R.drawable.image31,
            R.drawable.image32,
            R.drawable.image33,
            R.drawable.image34,
            R.drawable.image35,
            R.drawable.image36,
            R.drawable.image37,
            R.drawable.image38,
            R.drawable.image39,
            R.drawable.image40,
            R.drawable.image41,
            R.drawable.image42,
            R.drawable.image43,
            R.drawable.image44,
            R.drawable.image45,
            R.drawable.image46,
            R.drawable.image47,
            R.drawable.image48,
            R.drawable.image49,
            R.drawable.image50,
            R.drawable.image51,
            R.drawable.image52,
            R.drawable.image53,
            R.drawable.image54,
            R.drawable.image55
            
    };

    public GalleryImageAdapter(Context context) 
    {
        mContext = context;
    }

    public int getCount() {
        return mImageIds.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }


    // Override this method according to your need
    public View getView(int index, View view, ViewGroup viewGroup) 
    {
        // TODO Auto-generated method stub
        ImageView i = new ImageView(mContext);

        i.setImageResource(mImageIds[index]);
        i.setLayoutParams(new Gallery.LayoutParams(200, 200));
    
        i.setScaleType(ImageView.ScaleType.FIT_XY);

        return i;
    }
}