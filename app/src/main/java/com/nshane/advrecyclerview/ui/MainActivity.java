package com.nshane.advrecyclerview.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nshane.advrecyclerview.R;
import com.nshane.advrecyclerview.adapters.SysInfoAdapter;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private RecyclerView sysInfoRV;
    private LinearLayoutManager manager;
    private SysInfoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> content = new ArrayList<>();
        Collections.addAll(content, this.getResources().getStringArray(R.array.titles));


        sysInfoRV = (RecyclerView) findViewById(R.id.sys_info_rv);

        manager = new LinearLayoutManager(this);

        sysInfoRV.setLayoutManager(manager);

        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
        sysInfoRV.setHasFixedSize(false);

        adapter = new SysInfoAdapter(content, this);

        sysInfoRV.setAdapter(adapter);


    }
}
