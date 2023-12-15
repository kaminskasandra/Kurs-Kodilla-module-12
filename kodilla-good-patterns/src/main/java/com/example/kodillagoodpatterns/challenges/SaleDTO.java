package com.example.kodillagoodpatterns.challenges;

public class SaleDTO {

    private final User user;
    private final boolean isSold;

    public SaleDTO(final User user, final boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }
}

