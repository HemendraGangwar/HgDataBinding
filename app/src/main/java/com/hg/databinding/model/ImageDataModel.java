package com.hg.databinding.model;

import android.databinding.BindingAdapter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

/**
 * Created by hemendrag on 1/5/2017.
 */

public class ImageDataModel {

    /**
     * declare variables
     */
    public   int imageResource;
    public Bitmap imageBitmap;
    public Drawable drawable;


    /**
     * creating constructor of this model class
     * for setting up data
     * here no need of getter setter for setting data using data binding
     * @param imageResource
     * @param imageBitmap
     */
    public ImageDataModel(int imageResource, Bitmap imageBitmap) {
        this.imageResource = imageResource;
        this.imageBitmap = imageBitmap;
    }



    /*******************************Setting up data using custom method in image view ***************************/


    @BindingAdapter("setBitmap")
    public static void setImageBitmap(ImageView imageView, Bitmap imgBitmap){
        imageView.setImageBitmap(imgBitmap);
    }


    @BindingAdapter("setImgResource")
    public static void setImageResource(ImageView imageView, int resource){
        imageView.setImageResource(resource);
    }


    @BindingAdapter("setImgUri")
    public static void setImageUri(ImageView view, String imageUri) {
        if (imageUri == null) {
            view.setImageURI(null);
        } else {
            view.setImageURI(Uri.parse(imageUri));
        }
    }


    /*******************************Setting up data using default method in image view ***************************/


    @BindingAdapter("android:src")
    public static void setImageDrawable(ImageView view, Drawable drawable) {
        view.setImageDrawable(drawable);
    }


}
