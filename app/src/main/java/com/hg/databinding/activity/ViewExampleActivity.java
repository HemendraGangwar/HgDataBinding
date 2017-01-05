package com.hg.databinding.activity;

import android.databinding.DataBindingUtil;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hg.databinding.R;
import com.hg.databinding.databinding.ActivityViewBinding;
import com.hg.databinding.model.ImageDataModel;
import com.hg.databinding.model.TextViewDataModel;

public class ViewExampleActivity extends AppCompatActivity {

    private ActivityViewBinding mActivityViewBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityViewBinding = DataBindingUtil.setContentView(this,R.layout.activity_view);

        /**
         * set data on views
         * bind the data with views
         */
        dataSettingInViews();


    }

    private void dataSettingInViews() {


        /**
         * setting up text data on model
         */
        TextViewDataModel textViewDataModel             = new TextViewDataModel("Hemendra Gangwar","xyz@gmail.com");

        /**
         * setting up image data on model
         */
        Bitmap imageBitmap          = BitmapFactory.decodeResource(getResources(),R.mipmap.android_logo);
        int imgResourceId           = R.mipmap.ic_launcher;

        ImageDataModel imageDataModel       = new ImageDataModel(imgResourceId,imageBitmap);

        /**
         * binding these daa objects into the activity
         */
        mActivityViewBinding.setTextViewDataModel(textViewDataModel);
        mActivityViewBinding.setImageDataModel(imageDataModel);


    }
}
