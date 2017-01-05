package com.hg.databinding.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hg.databinding.R;
import com.hg.databinding.adapter.MyRecyclerViewAdapter;
import com.hg.databinding.model.TextViewDataModel;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyRecyclerViewAdapter mMyRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mMyRecyclerViewAdapter = new MyRecyclerViewAdapter(getDataList());
        mRecyclerView.setAdapter(mMyRecyclerViewAdapter);


    }

    private List<TextViewDataModel> getDataList() {

        List<TextViewDataModel> mMyModelsList = new ArrayList<>();

        for (int index = 0; index < 15; index++) {

            mMyModelsList.add(new TextViewDataModel((index+1)+". Lorem Ipsum is simply dummy text of the printing and typesetting industry", ""));

        }
        return mMyModelsList;
    }
}
