package com.suno2.recycelviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewById = findViewById(R.id.recycle);
        viewById.setLayoutManager(new LinearLayoutManager(this));

        List<Object> list = new ArrayList<>();
        for(int i=0;i<100;i++){
            list.add(new Object());
        }

        Adapter adapter = new Adapter(list);
        adapter.bindToRecyclerView(viewById);
    }



}
