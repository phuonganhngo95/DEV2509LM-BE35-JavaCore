package Lab09.BT1.vehicle.car;

import Lab09.BT1.vehicle.Vehicles;

import java.util.Scanner;

public class Car extends Vehicles {
    private String color;

    public Car() {
        super();
    }

    public Car(String maker, String model, double price, String color) {
        super(maker, model, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhập color: ");
        this.setColor(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Color: " + this.getColor());
    }
}
