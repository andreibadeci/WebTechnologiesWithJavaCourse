package com.fmi.fmimdb.model;

public class User extends Person{

    private String username;
    private String email;
    private String password;

    public User(int id, String firstName, String lastName, int age, String username, String email, String password) {
        super(id, firstName, lastName, age);
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "[User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                "}]";
    }
}
