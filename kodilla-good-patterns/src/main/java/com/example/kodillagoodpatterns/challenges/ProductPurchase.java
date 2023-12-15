package com.example.kodillagoodpatterns.challenges;

public class ProductPurchase {
    private final User user;
    private final Product product;


    public ProductPurchase(final User user, final Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

}

