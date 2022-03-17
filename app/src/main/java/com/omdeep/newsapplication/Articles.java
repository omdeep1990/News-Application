package com.omdeep.newsapplication;

public class Articles {

    private String title;
    private String desciption;
    private String urlToImage;
    private String url;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Articles(String title, String desciption, String urlToImage, String url, String content) {
        this.title = title;
        this.desciption = desciption;
        this.urlToImage = urlToImage;
        this.url = url;
        this.content = content;
    }
}
