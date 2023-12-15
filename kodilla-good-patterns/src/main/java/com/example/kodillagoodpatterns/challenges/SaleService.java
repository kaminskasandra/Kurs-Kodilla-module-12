package com.example.kodillagoodpatterns.challenges;

public class SaleService implements Sale{

    @Override
    public boolean sold(User user, Product product) {
        System.out.println("Product sold: " + product.getProductName() + ", " + product.getProductID() + ", " + product.getPrice());
        return true;
    }
}
