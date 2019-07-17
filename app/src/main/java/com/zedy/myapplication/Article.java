package com.zedy.myapplication;

public class Article {
    private  String Author;
    private  String Title;
    private  String Description;
    private  String UrlToImage;
    private  String PublishedAt ;
    private  String content ;

    public Article(String author, String title, String description, String urlToImage, String publishedAt, String content) {
        Author = author;
        Title = title;
        Description = description;
        UrlToImage = urlToImage;
        PublishedAt = publishedAt;
        this.content = content;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrlToImage() {
        return UrlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        UrlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return PublishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        PublishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
