package com.botory.entity;

import jakarta.persistence.*;

@Entity
@Table(name="record")
public class Record {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String publisher;
    private String category;
    private String content;
    private String feeling;
    private int rating;
    private String thumbnail;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //생성자 만들기
    public Record(){}
    public Record(String title,String author,String publisher,String category,String content,String feeling,int rating,String thumbnail,User user){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.content = content;
        this.feeling = feeling;
        this.rating = rating;
        this.thumbnail = thumbnail;
        this.user = user;
    }
    //getter,setter 만들기
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getFeeling() {
        return feeling;
    }
    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getThumbnail() {
        return thumbnail;
    }
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}
