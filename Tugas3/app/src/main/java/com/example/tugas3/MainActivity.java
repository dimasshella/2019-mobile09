package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas3.adapters.WayangJawaAdapter;
import com.example.tugas3.models.WayangJawa;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //instansiasi Recyclerview
    RecyclerView rvWayangJawa;
    //instansiasi list superhero
    List<WayangJawa> listWayangJawa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWayangJawa = findViewById(R.id.rvWayangJawa);

        WayangJawa jawa = new WayangJawa("Oddbods Purpel", R.drawable.ungu);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Green", R.drawable.ijo);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Purpel", R.drawable.ungu);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Green", R.drawable.ijo);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Purpel", R.drawable.ungu);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Green", R.drawable.ijo);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Purpel", R.drawable.ungu);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Green", R.drawable.ijo);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Purpel", R.drawable.ungu);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Green", R.drawable.ijo);

        listWayangJawa.add(jawa);

        WayangJawaAdapter wayangJawaAdapter = new WayangJawaAdapter(listWayangJawa);

        rvWayangJawa.setAdapter(wayangJawaAdapter);
        rvWayangJawa.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
