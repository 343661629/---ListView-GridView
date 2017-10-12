package com.example.administrator.listviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private ListView listview;
    private List<String> stringList;
    //private TestAdapter adapter;
    private SecondAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringList = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            stringList.add("在ViewHolder加了方法" + (i + 50));
        }

        listview = (ListView) findViewById(R.id.listview);
        //adapter = new TestAdapter(this, stringList);
        adapter = new SecondAdapter(stringList,this);
        listview.setAdapter(adapter);
    }
}

