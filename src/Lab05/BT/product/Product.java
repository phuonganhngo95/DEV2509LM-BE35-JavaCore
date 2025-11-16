package Lab05.BT.product;

import java.util.Scanner;

public class Product {
    private String prodId;
    private String prodName;
    private String manufacturer;
    private float producerPrice;

    public Product() {
    }

    public Product(String prodId, String prodName, String manufacturer, float producerPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }

    public float caculateSalePrice() {
        return producerPrice + 0.05f * producerPrice;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("   Enter Product ID: ");
        this.prodId = scanner.nextLine();
        System.out.print("   Enter Product Name: ");
        this.prodName = scanner.nextLine();
        System.out.print("   Enter Manufacturer: ");
        this.manufacturer = scanner.nextLine();
        System.out.print("   Enter Producer Price: ");
        this.producerPrice = scanner.nextFloat();
        scanner.nextLine();
    }

    public void display() {
        System.out.printf("| %-10s | %-20s | %-15s | %-15.2f |",
                prodId, prodName, manufacturer, producerPrice);
    }
}