package com.example.kodillagoodpatterns.challenges;

public class SaleProcessor {

    private final InformationService informationService;
    private final Sale saleService;
    private final DatabaseRepository databaseRepository;

    public SaleProcessor(final InformationService informationService, final Sale saleService, final DatabaseRepository databaseRepository) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.databaseRepository = databaseRepository;
    }

    public void process(final ProductPurchase productPurchase) {

        boolean isSold = saleService.sold(productPurchase.getUser(), productPurchase.getProduct());

        if (isSold) {
            informationService.sendInformation(productPurchase.getUser(), productPurchase.getProduct(), isSold);
            databaseRepository.createData(productPurchase.getUser(), productPurchase.getProduct());
        } else {
            informationService.sendInformation(productPurchase.getUser(), productPurchase.getProduct(), isSold);
        }
    }
}