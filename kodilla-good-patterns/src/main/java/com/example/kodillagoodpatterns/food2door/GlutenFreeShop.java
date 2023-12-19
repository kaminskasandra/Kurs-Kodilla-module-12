package com.example.kodillagoodpatterns.food2door;

public class GlutenFreeShop implements OrderProcess {

    private final String name = "GlutenFreeShop";
    private final String address = "ul. Dworska 103, Oława";

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
