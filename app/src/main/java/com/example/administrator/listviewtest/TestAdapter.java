package com.example.administrator.listviewtest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


/**
 * Created by huangjialin on 2017/9/12.
 */
public class TestAdapter extends BaseAdapter {
    private List<String> stringList;
    private Context mContext;

    public TestAdapter(Context context, List<String> stringList) {
        this.stringList = stringList;
        this.mContext = context;
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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = ViewHolder.getViewHolder(convertView, mContext, R.layout.item_single_str); //获取ViewHolder对象
        TextView textView = holder.getView(R.id.id_tv_title);//从ViewHolder中获取控件
        textView.setText(stringList.get(position));
        return holder.getConvertView();
    }
}
