package com.example.kodillagoodpatterns.food2door;

public class HealthyShop implements OrderProcess {

    private final String name = "HealthyShop";
    private final String address = "ul. Kopernika 12, Wrocław";


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
