package com.fmi.fmimdb.model;

public class Comment {

    private int id;
    private String comment;
    private User poster;
    private Movie movie;

    public Comment(int id, String comment, User poster, Movie movie) {
        this.id = id;
        this.comment = comment;
        this.poster = poster;
        this.movie = movie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getPoster() {
        return poster;
    }

    public void setPoster(User poster) {
        this.poster = poster;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", poster=" + poster +
                ", movie=" + movie +
                "}]";
    }
}
