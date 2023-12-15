package com.example.kodillagoodpatterns.challenges;

public class DatabaseRepository {

    private int numberOfProducts;
    public ProductPurchase createData(User user, Product product) {
        System.out.println("Saving sale to database: " + product.getProductID() + ", " + product.getProductName() + + product.getPrice() + " Buyer: " + user.getName() + " " + user.getLastName());
        return new ProductPurchase(user, product);
    }
}
