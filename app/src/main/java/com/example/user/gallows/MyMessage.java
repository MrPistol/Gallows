package com.example.user.gallows;

/**
 * Created by User on 01.12.2017.
 */

class MyMessage {
    String text;
    String author;
    int likes;

    public MyMessage(String text, String author) {
        this.text = text;
        this.author = author;
        likes = 0;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



}
