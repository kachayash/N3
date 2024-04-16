package com.plants.n3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Context;
import android.os.Bundle;

public class Homepage extends AppCompatActivity {


    RecyclerView recyclerView;
    Context context;

    String[] dptname = {"Information technology" , "Civil engineering" , "Chemical engineering" ,"Mechanical engineering" , "Electrical engineering"};
    int[] dptimg = {R.drawable.it2 ,R.drawable.ce,R.drawable.che ,R.drawable.me,R.drawable.ee};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        recyclerView = findViewById(R.id.sem_name);

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        context = this;

        DptAdpater adapter=new DptAdpater (Homepage.this , dptname , dptimg);
        recyclerView.setAdapter(adapter);
    }
}