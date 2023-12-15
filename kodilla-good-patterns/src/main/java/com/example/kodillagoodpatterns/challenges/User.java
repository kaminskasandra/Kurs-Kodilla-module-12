package com.example.kodillagoodpatterns.challenges;

public class User {

    private static String nickName;
    private final String name;
    private final String lastName;
    private final String email;

    public User(String nickName, String name, String lastName, String email) {
        User.nickName = nickName;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public static String getNickName() {
        return nickName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
}
