package com.plants.n3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DptAdpater extends RecyclerView.Adapter <DptAdpater.MyHolder>{

    Context context;
    String[] dptname;
    int[] dpting;

    public DptAdpater(Homepage homepage, String[] dptname, int[] dptimg) {
        this.context = homepage.context;
        this.dptname = dptname;
        this.dpting = dptimg;
    }

    @NonNull
    @Override
    public DptAdpater.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_branch,parent,false);

        return new MyHolder(view);    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView text;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.dpt_img);
            text=itemView.findViewById(R.id.dpt_name);


        }
    }

    @Override
    public void onBindViewHolder(@NonNull DptAdpater.MyHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.text.setText(dptname[position]);
        holder.img.setImageResource(dpting[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position ==0){
                    new commanmethod(context, it.class);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return dpting.length;
    }


}
