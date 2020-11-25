package com.fmi.fmimdb.model;

public class Cast extends Person{

    private String profession;
    private String description;
    private String dateOfBirth;
    private String bio;

    public Cast(int id, String firstName, String lastName, int age, String profession, String description, String dateOfBirth, String bio) {
        super(id, firstName, lastName, age);
        this.profession = profession;
        this.description = description;
        this.dateOfBirth = dateOfBirth;
        this.bio = bio;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "[Cast{" +
                ", profession='" + profession + '\'' +
                ", description='" + description + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", bio='" + bio + '\'' +
                "}]";
    }
}
