package com.app.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item(R.drawable.s1,"The word nature is borrowed from the Old French","Nature and is derived from the Latin word natura, essential qualities, innate disposition and in ancient times, literally meant. In ancient philosophy, natura is mostly used as the Latin translation of the Greek word physis"));
        itemList.add(new Item(R.drawable.s2,"Within the various uses of the word","today often refers to geology and wildlife. Nature can refer to the general realm of living plants and animals"));
        itemList.add(new Item(R.drawable.s3,"Earth is the only planet known to support life","and its natural features are the subject of many fields of scientific research. Within the solar system, it is third closest to the sun"));
        itemList.add(new Item(R.drawable.s4,"Earth has evolved through geological ","biological processes that have left traces of the original conditions. The outer surface is divided into several gradually migrating tectonic plates"));
        itemList.add(new Item(R.drawable.s5,"The atmospheric conditions have been significantly altered"," Despite the wide regional variations in climate by latitude and other geographic factors, the long-term average global climate is quite stable during interglacial periods"));
        itemList.add(new Item(R.drawable.s6,"Geology is the science and study of the solid and liquid matter","he field of geology encompasses the study of the composition, structure, physical properties, dynamics, and history of Earth materials, and the processes"));

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this, itemList);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}