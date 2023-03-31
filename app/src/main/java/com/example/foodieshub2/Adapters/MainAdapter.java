package com.example.foodieshub2.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodieshub2.Activitytesting;
import com.example.foodieshub2.Models.MainModel;
import com.example.foodieshub2.R;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewHolder>{
    ArrayList<MainModel>list;
    Context context;

    public MainAdapter(ArrayList<MainModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_foodfood,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final viewHolder holder, int position) {
        final MainModel model=list.get(position);
        holder.foodimage.setImageResource(model.getImage());
        holder.name.setText(model.getName());
        holder.price.setText(model.getPrice());
        holder.description.setText(model.getDescription());
        holder.itemView.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, Activitytesting.class);
                intent.putExtra("image",model.getImage());
                intent.putExtra("price",model.getPrice());
                intent.putExtra("desc",model.getDescription());
                intent.putExtra("name",model.getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView foodimage;
        TextView name,price,description;
         public viewHolder(@NonNull View itemView) {
            super(itemView);

            foodimage=itemView.findViewById(R.id.pizza);
            name=itemView.findViewById(R.id.pizzatv);
            price=itemView.findViewById(R.id.orderprice);
            description=itemView.findViewById(R.id.descriptionmain);
        }
    };
}
