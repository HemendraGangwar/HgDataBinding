package com.hg.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by hemendrag on 1/5/2017.
 */

public class TextViewDataModel extends BaseObservable {


    /**
     * declare variables
     */
    public String userName;
    public String userEmail;


    /**
     * creating constructor of this model class
     * for setting up data
     * here no need of getter setter for setting data using data binding
     * @param userName
     * @param userEmail
     */
    public TextViewDataModel( String userName,String userEmail) {

        this.userName = userName;
        this.userEmail = userEmail;

    }


    /**
     * the below method is used for checking the data of text view
     * by using android data binding,
     * instead of checking individual text view data at runtime
     * @param mTextView
     * @param textToSet
     */
    @BindingAdapter("checkIfNullOrEmpty")
    public static void checkIfNullOrEmpty(TextView mTextView, String textToSet){

        if(textToSet != null && !TextUtils.isEmpty(textToSet)){

            mTextView.setText(textToSet);

        }else {
            Log.e("tag","Data for textView = "+textToSet);
        }

    }
}
