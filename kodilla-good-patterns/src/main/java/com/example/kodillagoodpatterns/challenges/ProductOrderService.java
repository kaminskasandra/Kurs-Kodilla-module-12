package com.example.kodillagoodpatterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {

      PurchaseRetriever purchaseRetriever = new PurchaseRetriever();
      ProductPurchase productPurchase = purchaseRetriever.retrieve();
      SaleProcessor saleProcessor = new SaleProcessor(new EmailService(), new SaleService(), new DatabaseRepository());
      saleProcessor.process(productPurchase);

    }
}

