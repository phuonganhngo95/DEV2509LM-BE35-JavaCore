package Lab05.BT.vietnam;

import Lab05.BT.product.Product;
import java.util.Scanner;

public class VietNamImportPrice extends Product {
    private float taxImported;

    public VietNamImportPrice() {
        super();
    }

    public VietNamImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    @Override
    public float caculateSalePrice() {
        float importedPrice = getProducerPrice();
        float priceAfterTax = importedPrice + taxImported * importedPrice;
        float salePrice = priceAfterTax + 0.10f * priceAfterTax;
        return salePrice;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("   Enter Import Tax Rate (e.g., 0.1 for 10%): ");
        this.taxImported = scanner.nextFloat();
        scanner.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" %-15.2f | %-15.2f | %-15s\n",
                taxImported, caculateSalePrice(), "Vietnam");
    }
}