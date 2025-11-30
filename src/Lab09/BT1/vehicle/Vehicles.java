package Lab09.BT1.vehicle;

import java.util.Scanner;

public class Vehicles implements IVehicle {
    protected String maker;
    protected String model;
    protected double price;

    public Vehicles() {}

    public Vehicles(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập maker: ");
        this.setMaker(sc.nextLine());
        System.out.print("Nhập model: ");
        this.setModel(sc.nextLine());
        System.out.print("Nhập price: ");
        this.setPrice(sc.nextDouble());
    }

    @Override
    public void display() {
        System.out.println("Maker: " + this.getMaker());
        System.out.println("Model: " + this.getModel());
        System.out.println("Price: " + this.getPrice());
    }
}
