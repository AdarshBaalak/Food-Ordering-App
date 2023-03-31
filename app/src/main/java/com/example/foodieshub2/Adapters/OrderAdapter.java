package com.example.foodieshub2.Adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodieshub2.Models.OrderModel;
import com.example.foodieshub2.R;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {
    ArrayList<OrderModel>list;
    Context context;

    public OrderAdapter(ArrayList<OrderModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_order,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     final OrderModel model=list.get(position);
     holder.orderImage.setImageResource(model.getOrderImg());
     holder.orderName.setText(model.getSoldItem());
     holder.orderNumber.setText(model.getOrderNumber());
     holder.price.setText(model.getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
    ImageView orderImage;
    TextView orderName,orderNumber,price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            orderImage=itemView.findViewById(R.id.orderImage);
            orderName=itemView.findViewById(R.id.ordername);
            orderNumber=itemView.findViewById(R.id.orderNum);
            price=itemView.findViewById(R.id.OrderPricee);
        }
    }
}
