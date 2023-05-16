package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView topStoriesView, newsView;
    private List<News> newsList, topStories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topStoriesView = findViewById(R.id.top_stories_view);
        newsView = findViewById(R.id.news_view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        topStoriesView.setLayoutManager(linearLayoutManager);

        topStoriesView.setHasFixedSize(true);
        topStories = NewsStore.getTopStories();

        topStoriesView.setAdapter(new TopStoriesAdapter((topStories)));

        LinearLayoutManager linearLayoutNewsManager = new LinearLayoutManager(this);
        linearLayoutNewsManager.setOrientation(RecyclerView.VERTICAL);
        newsView.setLayoutManager(linearLayoutNewsManager);

        newsView.setHasFixedSize(true);
        newsList = NewsStore.getNews();

        newsView.setAdapter(new NewsAdapter((newsList)));
    }
}