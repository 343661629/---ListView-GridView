package com.example.administrator.listviewtest;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.List;

/**
 * Created by Administrator on 2017/10/11 0011.
 * 万能适配器
 */

public abstract class PowerfulAdapter<T> extends BaseAdapter {

    private List<T> stringList;

    public PowerfulAdapter(List<T> stringList) {
        this.stringList = stringList;
    }

    @Override
    public int getCount() {
        return stringList.size();
    }

    @Override
    public Object getItem(int position) {
        return stringList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
