package com.example.usingrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> lstData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land, parent, false);
        ItemLandHolder viewholderCreated = new ItemLandHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        //Lay doi tuong hien thi
        LandScape landScapeHienThi = lstData.get(position);
        //Trich thong tin
        String caption = landScapeHienThi.getLandCation();
        String tenfileAnh = landScapeHienThi.getLandInageFileName();
        //Dat vao cac truong thong tin cua holder
        holder.tvCaption.setText(caption);
        // dat anh
        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenfileAnh,"mimap", packageName);
        holder.ivLandscape.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandHolder extends  RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvCaption;
        ImageView ivLandscape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCation);
            ivLandscape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //Lay vi tri duoc click thong qua phuong thuc getAdapterPosition()
            int vutriDuocClick = getAdapterPosition();
            //Lay du lieu tuong ung tu danh sach  (theo vi tri)
            LandScape phantuduocClick = lstData.get(vutriDuocClick);
            String ten = phantuduocClick.getLandCation();
            String tenfile = phantuduocClick.getLandInageFileName();
            //Hien thong bao hoac thuc hien cac xu ly khac
            String chuoithongbao = "Ban vua Click vao : " + ten;
            Toast.makeText(v.getContext(), chuoithongbao, Toast.LENGTH_SHORT).show();
        }
    }
}
