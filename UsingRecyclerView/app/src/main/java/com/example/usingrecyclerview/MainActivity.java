package com.example.usingrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewlandScapes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //3
        recyclerViewDatas = getDataForRecyclerView();
        //4
        recyclerViewlandScapes = findViewById(R.id.recyclerLand);
        //5
            //chieu doc
//        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
//        recyclerViewlandScapes.setLayoutManager(layoutLinear);
            //chieu nganh
//        RecyclerView.LayoutManager layoutLinearMorizonal = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
//        recyclerViewlandScapes.setLayoutManager(layoutLinearMorizonal);
            //gird
        RecyclerView.LayoutManager layoutLinearGird = new GridLayoutManager(this,2);
        recyclerViewlandScapes.setLayoutManager(layoutLinearGird);
        //6
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewDatas);
        //7
        recyclerViewlandScapes.setAdapter(landScapeAdapter);
    }

    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDulieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("trex.png", "Con khung long");
        dsDulieu.add(landScape1);
        dsDulieu.add(new LandScape("beach.png", "bien"));
        dsDulieu.add(new LandScape("wave.png", "song bien"));
        return  dsDulieu;
    }
}