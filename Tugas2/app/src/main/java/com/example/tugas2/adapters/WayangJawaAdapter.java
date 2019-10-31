package com.example.tugas2.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas2.R;
import com.example.tugas2.models.WayangJawa;

import java.util.ArrayList;
import java.util.List;

public class WayangJawaAdapter extends RecyclerView.Adapter<WayangJawaAdapter.MyViewHolder> {
    private List<WayangJawa> jawaList = new ArrayList<>();

    public WayangJawaAdapter(List<WayangJawa> jawaList) {
        this.jawaList = jawaList;
    }

    @NonNull
    @Override
    public WayangJawaAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View superHeroView = layoutInflater.inflate(R.layout.item_wayang_jawa,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(superHeroView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull WayangJawaAdapter.MyViewHolder holder, int position) {
        //ambil satu item hero
        WayangJawa jawa = jawaList.get(position);
        //set text wayangJawa berdasarkan data dari model hero
        holder.wayangJawa.setText(jawa.getWayangJawa());
        holder.gambar.setImageResource(jawa.getGambar());
    }

    @Override
    public int getItemCount() {
        return (jawaList != null) ? jawaList.size() : 0;
        /*for non shorthand people*/
        /*if(heroList!=null){
          return heroList.size();
        }else{
          return 0;
        }*/
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView wayangJawa;
        public ImageView gambar;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            wayangJawa = itemView.findViewById(R.id.wayangJawa);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }
}
