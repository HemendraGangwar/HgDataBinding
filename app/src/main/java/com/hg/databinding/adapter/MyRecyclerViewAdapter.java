package com.hg.databinding.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.hg.databinding.BR;
import com.hg.databinding.R;
import com.hg.databinding.model.TextViewDataModel;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.CustomViewHolder> {
    private List<TextViewDataModel> mMyModels;

    public MyRecyclerViewAdapter(List<TextViewDataModel> myModels) {
        mMyModels = myModels;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.row_view, viewGroup, false);
        
        return new CustomViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder customViewHolder, int i) {
        ViewDataBinding viewDataBinding = customViewHolder.getViewDataBinding();
        viewDataBinding.setVariable(BR.myModel, mMyModels.get(i));
    }

    @Override
    public int getItemCount() {
        return (null != mMyModels ? mMyModels.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private ViewDataBinding mViewDataBinding;

        public CustomViewHolder( ViewDataBinding viewDataBinding) {
            super(viewDataBinding.getRoot());

            mViewDataBinding = viewDataBinding;
            mViewDataBinding.executePendingBindings();
        }

        public ViewDataBinding getViewDataBinding() {
            return mViewDataBinding;
        }
    }

}