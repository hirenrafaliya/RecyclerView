package com.app.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private final Context context;
    private final List<Item> itemList;

    public RecyclerAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(itemList.get(position).getImg());
        holder.tvTitle.setText(itemList.get(position).getTitle());
        holder.tvDesc.setText(itemList.get(position).getDesc());

        holder.layoutParent.setOnClickListener(view -> Toast.makeText(context, itemList.get(position).getTitle(), Toast.LENGTH_SHORT).show());
        holder.layoutParent.setClipToOutline(true);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView tvTitle,tvDesc;
        ConstraintLayout layoutParent;
         public ViewHolder(@NonNull View itemView) {
             super(itemView);
             layoutParent=itemView.findViewById(R.id.layoutParent);
             img=itemView.findViewById(R.id.img);
             tvTitle=itemView.findViewById(R.id.tvTitle);
             tvDesc=itemView.findViewById(R.id.tvDesc);
         }
     }
}
