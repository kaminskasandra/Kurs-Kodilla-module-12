package com.example.kodillagoodpatterns.challenges;

public class EmailService implements InformationService{

    @Override
    public void sendInformation(User user, Product product, boolean isSold) {
        if (isSold) {
            System.out.println("Hello, " + user.getName() + " " + user.getLastName()
                    + " you have just purchased a product: " + product.getProductName());
            System.out.println("Price: " + product.getPrice());
        } else {
            System.out.println("Hello, " + user.getName() + " " + user.getLastName()
                    + "Unfortunately, we are unable to process your order. For more information, please contact our customer service center");
        }
    }
}
