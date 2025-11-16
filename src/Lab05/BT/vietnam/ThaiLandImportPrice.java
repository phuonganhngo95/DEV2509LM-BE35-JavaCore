package Lab05.BT.vietnam;

import Lab05.BT.product.Product;
import java.util.Scanner;

public class ThaiLandImportPrice extends Product {
    private float taxImported;
    private float importPriceSupport;

    public ThaiLandImportPrice() {
        super();
    }

    public ThaiLandImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported, float importPriceSupport) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    public float getImportPriceSupport() {
        return importPriceSupport;
    }

    public void setImportPriceSupport(float importPriceSupport) {
        this.importPriceSupport = importPriceSupport;
    }

    @Override
    public float caculateSalePrice() {
        float importedPrice = getProducerPrice();
        float costAfterTaxAndSubsidy = importedPrice + taxImported * importedPrice - importPriceSupport * importedPrice;
        float salePrice = costAfterTaxAndSubsidy + 0.10f * costAfterTaxAndSubsidy;
        return salePrice;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Import Tax Rate (e.g., 0.1 for 10%): ");
        this.taxImported = scanner.nextFloat();
        System.out.print("Enter Import Price Support Rate (e.g., 0.05 for 5%): ");
        this.importPriceSupport = scanner.nextFloat();
        scanner.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" %-15.2f | %-15.2f | %-15s\n", 
                taxImported, caculateSalePrice(), "Thailand");
    }
}