package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas2.adapters.WayangJawaAdapter;
import com.example.tugas2.models.WayangJawa;

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

        WayangJawa jawa = new WayangJawa("Oddbods Purpel", R.drawable.purpel);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Blue", R.drawable.biru);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Purpel", R.drawable.purpel);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Blue", R.drawable.biru);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Purpel", R.drawable.purpel);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Blue", R.drawable.biru);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Purpel", R.drawable.purpel);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Blue", R.drawable.biru);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Purpel", R.drawable.purpel);

        listWayangJawa.add(jawa);

        jawa = new WayangJawa("Oddbods Blue", R.drawable.biru);

        listWayangJawa.add(jawa);

        WayangJawaAdapter wayangJawaAdapter = new WayangJawaAdapter(listWayangJawa);

        rvWayangJawa.setAdapter(wayangJawaAdapter);
        rvWayangJawa.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
}
