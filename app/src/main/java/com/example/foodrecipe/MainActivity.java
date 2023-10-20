package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<item> items = new ArrayList<>();
        items.add(new item("Zinger Burger", "A well-seasoned, crispy fried chicken fillet slathered with a special burger sauce, topped with a slice of Cheddar cheese, finished off with Romaine lettuce and put inside a soft Brioche bun", R.drawable.a));
        items.add(new item("Biryani", "Biryani (/bɜːrˈjɑːni/) is a mixed rice dish originating among the Muslims of South Asia.", R.drawable.b));

        adapter = new MyAdapter(this, items);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}