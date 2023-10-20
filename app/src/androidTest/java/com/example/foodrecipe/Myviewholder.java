package com.example.foodrecipe;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myviewholder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameview;
    public Myviewholder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
                nameview = itemView.findViewById(R.id.name);
    }
}
