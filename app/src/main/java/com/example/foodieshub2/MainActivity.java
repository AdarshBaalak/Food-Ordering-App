package com.example.foodieshub2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.Menu;

import com.example.foodieshub2.Adapters.MainAdapter;
import com.example.foodieshub2.Models.MainModel;
import com.example.foodieshub2.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel>list =new ArrayList<>();
        list.add(new MainModel(R.drawable.pizza,"Pizza","5","Dish consisting of a bread topped with oil,oregano,cheese,and other ingredients."));
        list.add(new MainModel(R.drawable.burger,"Burger","3","Food consisting of fillings usually a patty and veggies inside a sliced bun."));
        list.add(new MainModel(R.drawable.noodles,"Noodles","5","Food made from dough which is rolled flat and cut into long strips or strings."));
        list.add(new MainModel(R.drawable.sandwich,"Sandwich","2","Food typically consisting of vegetables, cheese or meat, placed between slices of bread."));
        list.add(new MainModel(R.drawable.sweet,"Dessert","5","Desserts can be defined as a usually sweeter course that concludes a meal."));

        MainAdapter adapter=new MainAdapter(list,this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}
