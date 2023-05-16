package com.example.newsapp;

public class News {
    private String count, headline, news, content, category;
    private boolean topStory;

    public News(String count, String headline, String news, String content, String category, boolean topStory) {
      this.count = count;
      this.headline = headline;
      this.news = news;
      this.content = content;
      this.category = category;
      this.topStory = topStory;
    }

    public String getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public boolean isTopStory() {
        return topStory;
    }

    public String getCount() {
        return count;
    }

    public String getHeadline() {
        return headline;
    }

    public String getNews() {
        return news;
    }
}
