package com.example.foodieshub2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Adapter;

import com.example.foodieshub2.Adapters.OrderAdapter;
import com.example.foodieshub2.Models.MainModel;
import com.example.foodieshub2.Models.OrderModel;
import com.example.foodieshub2.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    ActivityOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<OrderModel>list=new ArrayList<>();
        list.add(new OrderModel(R.drawable.burger,"Burger","3","01"));
        list.add(new OrderModel(R.drawable.pizza,"Pizza","5","01"));
        list.add(new OrderModel(R.drawable.noodles,"Noodles","5","01"));
        list.add(new OrderModel(R.drawable.sandwich,"Sandwich","2","01"));
        list.add(new OrderModel(R.drawable.sweet,"Dessert","5","01"));

        OrderAdapter adapter=new OrderAdapter(list,this);
        binding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);
    }
}