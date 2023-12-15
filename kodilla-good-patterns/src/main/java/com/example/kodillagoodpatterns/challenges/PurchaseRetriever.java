package com.example.kodillagoodpatterns.challenges;

public class PurchaseRetriever {

    public ProductPurchase retrieve() {

        User user = new User("an.kow", "Anna", "Kowalska", "anna.kow@onet.pl");
        Product product = new Product("2220192d", "White T-shirt", 89.99);
        ProductPurchase productPurchase = new ProductPurchase(user, product);

        return productPurchase;
    }
}

