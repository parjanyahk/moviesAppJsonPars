package com.example.android.moviesappjsonpars;

public class Movies {
    String title;
    String imageUrl;

    public Movies() {
    }

    public Movies(String title, String imageUrl){
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
