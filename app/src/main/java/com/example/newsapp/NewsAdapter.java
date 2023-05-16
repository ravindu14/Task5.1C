package com.example.newsapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    List<News> listItems;

    public NewsAdapter(List<News> listItems) {
        this.listItems = listItems;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item, parent, false);
        return new NewsViewHolder((view));
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        holder.news_headline.setText(listItems.get(position).getHeadline());
        holder.news_content.setText(listItems.get(position).getNews());
        holder.news_image.setImageResource(getImage(listItems.get(position).getCount()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent newsIntent = new Intent(context, NewsActivity.class);
                newsIntent.putExtra("count", listItems.get(holder.getAdapterPosition()).getCount());
                newsIntent.putExtra("category", listItems.get(holder.getAdapterPosition()).getCategory());
                context.startActivity(newsIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder {
        LinearLayout news_layout;
        TextView news_headline, news_content;
        ImageView news_image;
        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            news_headline = itemView.findViewById(R.id.news_headline);
            news_content = itemView.findViewById(R.id.news_content);
            news_image = itemView.findViewById(R.id.news_image);
        }
    }

    private int getImage(String position) {
        switch (position) {
            case "news1":
                return R.drawable.news1;
            case "news2":
                return R.drawable.news2;
            case "news3":
                return R.drawable.news3;
            case "news4":
                return R.drawable.news4;
            case "news5":
                return R.drawable.news5;
            case "news6":
                return R.drawable.news6;
            case "news7":
                return R.drawable.news7;
            case "news8":
                return R.drawable.news8;
            case "news9":
                return R.drawable.news9;
            case "news10":
                return R.drawable.news10;
            case "news11":
                return R.drawable.news11;
            case "news12":
                return R.drawable.news12;
            case "news13":
                return R.drawable.news13;
            case "news14":
                return R.drawable.news14;
            case "news15":
                return R.drawable.news15;
            default:
                return -1;
        }
    }
}
