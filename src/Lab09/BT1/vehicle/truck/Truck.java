package Lab09.BT1.vehicle.truck;

import Lab09.BT1.vehicle.Vehicles;

import java.util.Scanner;

public class Truck extends Vehicles {
    private int truckload;

    public Truck() {
        super();
    }

    public Truck(String maker, String model, double price, int truckload) {
        super(maker, model, price);
        this.truckload = truckload;
    }

    public int getTruckload() {
        return truckload;
    }

    public void setTruckload(int truckload) {
        this.truckload = truckload;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhập truckload: ");
        this.setTruckload(sc.nextInt());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Truckload: " + this.getTruckload());
    }
}
