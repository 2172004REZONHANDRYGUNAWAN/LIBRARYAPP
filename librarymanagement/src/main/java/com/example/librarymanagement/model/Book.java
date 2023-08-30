package com.example.librarymanagement.model;

import java.sql.Date;

public class Book {

    public static String path;
    public static String takeBookTitle;
    public static String studentNumber;
    public static String savedImage;
    public static String savedTitle;
    public static String savedAuthor;
    public static String savedGenre;
    public static Date savedDate;
    private final String title;
    private final String author;
    private final String genre;
    private final String image;
    private final Date date;

    public Book(String title, String author, String genre, String image, Date date){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.image = image;
        this.date = date;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public String getImage(){
        return image;
    }
    public Date getDate(){
        return date;
    }

}
