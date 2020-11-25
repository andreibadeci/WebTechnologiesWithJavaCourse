package com.fmi.fmimdb.model;

import java.util.List;

public class Movie {

    private int id;
    private String name;
    private String description;
    private List<Cast> cast;

    public Movie(int id, String name, String description, List<Cast> cast) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cast = cast;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cast=" + cast +
                "}]";
    }
}
