package com.example.kodillagoodpatterns.food2door;

public class ExtraFoodShop implements OrderProcess {

    private final String name = "ExtraFoodShop";
    private final String address = "ul. Opolska 28, Brzeg";

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void process(Order order) {
        System.out.println("Product: '" + order.getProductName() + "' " + "is being prepared for shipment. Quantity: " + order.getQuantity() + " Supplier: " + getName() + ", " + getAddress());

    }
}
