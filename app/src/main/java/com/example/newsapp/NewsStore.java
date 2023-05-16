package com.example.newsapp;

import java.util.ArrayList;
import java.util.List;

public class NewsStore {
    private static List<News> news() {

        final List<News> newsList = new ArrayList<>();

        final News news1 = new News("news1", "Headline 1", "Description about news item 1", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category1", true);
        final News news2 = new News("news2", "Headline 2", "Description about news item 2", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category2", true);
        final News news3 = new News("news3", "Headline 3", "Description about news item 3", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category3", false);
        final News news4 = new News("news4", "Headline 4", "Description about news item 4", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category1", false);
        final News news5 = new News("news5", "Headline 5", "Description about news item 5", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category2", true);
        final News news6 = new News("news6", "Headline 6", "Description about news item 6", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category3", false);
        final News news7 = new News("news7", "Headline 7", "Description about news item 7", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category1", true);
        final News news8 = new News("news8", "Headline 8", "Description about news item 8", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category2", false);
        final News news9 = new News("news9", "Headline 9", "Description about news item 9", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category3", false);
        final News news10 = new News("news10", "Headline 10", "Description about news item 10", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category1", true);
        final News news11 = new News("news11", "Headline 11", "Description about news item 11", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category2", true);
        final News news12 = new News("news12", "Headline 12", "Description about news item 12", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category3", false);
        final News news13 = new News("news13", "Headline 13", "Description about news item 13", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category1", true);
        final News news14 = new News("news14", "Headline 14", "Description about news item 14", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category2", false);
        final News news15 = new News("news15", "Headline 15", "Description about news item 15", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.", "category3", true);

        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);
        newsList.add(news4);
        newsList.add(news5);
        newsList.add(news6);
        newsList.add(news7);
        newsList.add(news8);
        newsList.add(news9);
        newsList.add(news10);
        newsList.add(news11);
        newsList.add(news12);
        newsList.add(news13);
        newsList.add(news14);
        newsList.add(news15);

        return newsList;
    }

    public static List<News> getNews() {
        return news();
    }

    public static List<News> getTopStories() {
        List<News> newsList = news();

        final List<News> topList = new ArrayList<>();

        for(int i=0; i<newsList.size();i++) {
            if(newsList.get(i).isTopStory()) {
                topList.add(newsList.get(i));
            }
        }

        return topList;
    }

    public static List<News> getRelatedNews(String category) {
        List<News> newsList = news();

        final List<News> relatedStories = new ArrayList<>();

        for(int i=0; i<newsList.size();i++) {
            if(newsList.get(i).getCategory().equals(category)) {
                relatedStories.add(newsList.get(i));
            }
        }

        return relatedStories;
    }

    public static News getNewsItem(String count) {
        List<News> newsList = news();
        News selected = null;

        for (int i = 0; i < newsList.size(); i++) {
            if (newsList.get(i).getCount().equals(count)) {
                selected = newsList.get(i);
            }
        }

        return selected;
    }
}
