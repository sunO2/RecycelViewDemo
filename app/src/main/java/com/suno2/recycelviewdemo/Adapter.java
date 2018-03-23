package com.suno2.recycelviewdemo;

import android.support.annotation.Nullable;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Name: RecycelViewDemo
 * Author: hezhihu
 * Email: 2854918124@qq.com
 * 创建时间: 2018/3/23 10:26
 * 修改时间:  2018/3/23 10:26
 * 内容描述:
 */

public class Adapter extends BaseQuickAdapter<Object,BaseViewHolder> {
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data        A new list is created out of this one to avoid mutable list
     */
    public Adapter(@Nullable List<Object> data) {
        super(R.layout.oppo_plus_notice_item, data);
    }



    /**
     * Implement this method and use the helper to adapt the view to the given item.
     *
     * @param helper A fully initialized helper.
     * @param item   The item that needs to be displayed.
     */
    @Override
    protected void convert(BaseViewHolder helper, Object item) {

    }
}
