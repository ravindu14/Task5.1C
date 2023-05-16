package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewsActivity extends AppCompatActivity {
    RecyclerView relatedStoriesView;
    TextView headline, news_content;
    ImageView news_image;

    private List<News> relatedStories;
    private News news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        headline = findViewById(R.id.headline);
        news_content = findViewById(R.id.news_content);
        news_image = findViewById(R.id.news_image);
        relatedStoriesView = findViewById(R.id.related_stories_view);

        news = NewsStore.getNewsItem(getIntent().getStringExtra("count"));
        relatedStories = NewsStore.getRelatedNews(getIntent().getStringExtra("category"));

        headline.setText(news.getHeadline());
        news_content.setText(news.getContent());
        news_image.setImageResource(getImage(news.getCount()));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        relatedStoriesView.setLayoutManager(linearLayoutManager);

        relatedStoriesView.setHasFixedSize(true);

        relatedStoriesView.setAdapter(new TopStoriesAdapter((relatedStories)));

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