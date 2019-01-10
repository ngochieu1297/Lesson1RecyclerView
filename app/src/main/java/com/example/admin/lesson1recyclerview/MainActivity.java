package com.example.admin.lesson1recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerHeroes;
    private RecyclerView.Adapter mHeroesAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Hero> mHeroes = new ArrayList<>();
    public static int width;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mRecyclerHeroes.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerHeroes.setLayoutManager(mLayoutManager);

        addData();
        mHeroesAdapter = new HeroesAdapter(mHeroes);
        mRecyclerHeroes.setAdapter(mHeroesAdapter);
        width = getWindowManager().getDefaultDisplay().getWidth();
    }

    private void addData() {
        mHeroes.add(new Hero("Black Panther", R.drawable.blackpanther));
        mHeroes.add(new Hero("Captain America", R.drawable.captain));
        mHeroes.add(new Hero("Hulk", R.drawable.hulk));
        mHeroes.add(new Hero("Ironfist", R.drawable.ironfist));
        mHeroes.add(new Hero("Ironman", R.drawable.ironman));
        mHeroes.add(new Hero("Scarlet Witch", R.drawable.scarlet));
        mHeroes.add(new Hero("Storm", R.drawable.storm));
        mHeroes.add(new Hero("Ultron", R.drawable.ultron));
        mHeroes.add(new Hero("Wolverine", R.drawable.wolverine));
    }

    private void initView() {
        mRecyclerHeroes = findViewById(R.id.recycler_view_hero_picture);
    }
}
