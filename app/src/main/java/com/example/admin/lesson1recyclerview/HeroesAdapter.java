package com.example.admin.lesson1recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class HeroesAdapter extends RecyclerView.Adapter<HeroesAdapter.ViewHolder> {
    private List<Hero> mHeroes;

    public HeroesAdapter(List<Hero> heroes) {
        mHeroes = heroes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_hero, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(mHeroes.get(position));
    }

    @Override
    public int getItemCount() {
        return mHeroes.size() > 0 ?  mHeroes.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView;
        private TextView mTextView;
        public final int image_height = 600;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imgae_view_hero);
            mTextView = itemView.findViewById(R.id.text_hero_name);
        }

        public void setData(Hero data) {
            Picasso.get().load(data.getPicture()).resize(MainActivity.width, image_height).into(mImageView);
            mTextView.setText(data.getName());
        }
    }
}
