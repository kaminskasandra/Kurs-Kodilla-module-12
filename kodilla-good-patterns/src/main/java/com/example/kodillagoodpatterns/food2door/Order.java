package com.example.kodillagoodpatterns.food2door;

public class Order {
    private final String supplier;
    private final String productName;
    private final int quantity;

    public Order(String supplier, String productName, int quantity) {
        this.supplier = supplier;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
