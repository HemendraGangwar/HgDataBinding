
package com.hg.databinding.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hg.databinding.R;
import com.hg.databinding.databinding.ActivityHomeBinding;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityHomeBinding mActivityHomeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        /**
         * setting on click event on views
         */
        setOnClickEventOnViews();

    }


    /**
     * setting on click events on views
     */
    private void setOnClickEventOnViews() {

        mActivityHomeBinding.buttonSimpleView.setOnClickListener(this);
        mActivityHomeBinding.buttonRecyclerView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.buttonSimpleView:

                startActivity(new Intent(HomeActivity.this,ViewExampleActivity.class));

                break;
            case R.id.buttonRecyclerView:

                startActivity(new Intent(HomeActivity.this,RecyclerViewActivity.class));

                break;

        }
    }


}


