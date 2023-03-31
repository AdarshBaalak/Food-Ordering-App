package com.example.foodieshub2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodieshub2.databinding.ActivityTestingBinding;

public class Activitytesting extends AppCompatActivity {
   ActivityTestingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTestingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final int image=getIntent().getIntExtra("image",0);
        final int price=Integer.parseInt(getIntent().getStringExtra("price"));
        final String name=getIntent().getStringExtra("name");
        final String description=getIntent().getStringExtra("desc");

        binding.imagedetail.setImageResource(image);
        binding.detailtv.setText(name);
        binding.finalpricedetail.setText(String.format("%d",price));
        binding.descriptiondetail.setText(description);

        final DBhelper helper=new DBhelper(this);
        binding.orderbuttondetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             boolean isInserted=helper.InsertOrder(
                     binding.etNamedetail.getText().toString(),
                     binding.etPhonedetail.getText().toString(),
                     price,
                     image,
                     Integer.parseInt(binding.quantity.getText().toString()),
                     description,
                     name
                     );
             if(isInserted)
             {
                 Toast.makeText(Activitytesting.this,"Data Success",Toast.LENGTH_SHORT).show();
             }
             else
             {
                 Toast.makeText(Activitytesting.this,"Error",Toast.LENGTH_SHORT).show();
             }
            }
        });
    }
}