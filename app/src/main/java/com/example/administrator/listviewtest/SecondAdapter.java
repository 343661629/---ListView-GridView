package com.example.administrator.listviewtest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/10/11 0011.
 */

public class SecondAdapter<T> extends PowerfulAdapter<T> {
    private List<String> stringList;
    private Context mContext;

    public SecondAdapter(List<T> stringList, Context mContext) {
        super(stringList);
        this.stringList = (List<String>) stringList;
        this.mContext = mContext;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder = ViewHolder.getViewHolder(convertView, mContext, R.layout.item_single_str); //获取ViewHolder对象

        /**
         * 旧的写法
         */
        /*TextView textView = holder.getView(R.id.id_tv_title);//从ViewHolder中获取控件
        textView.setText(stringList.get(position));*/

        /**
         * 在ViewHolder加了setText方法后的写法
         */
        holder.setText(R.id.id_tv_title, stringList.get(position));


        return holder.getConvertView();
    }
}
