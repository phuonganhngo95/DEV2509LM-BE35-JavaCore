package Lab07.BT2;

import java.util.Scanner;

public class Flower {
    private String flowerId;
    private String flowerName;
    private String color;
    private int kindOfFlower;

    public Flower() {}

    public Flower(String flowerId, String flowerName, String color, int kindOfFlower) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.color = color;
        this.kindOfFlower = kindOfFlower;
    }

    public String getFlowerId() {
        return flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getColor() {
        return color;
    }

    public int getKindOfFlower() {
        return kindOfFlower;
    }

    public void setFlowerId(String flowerId) {
        this.flowerId = flowerId;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKindOfFlower(int kindOfFlower) {
        this.kindOfFlower = kindOfFlower;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập flowerId: ");
        this.flowerId = sc.nextLine();
        System.out.print("Nhập flowerName: ");
        this.flowerName = sc.nextLine();
        System.out.print("Nhập color: ");
        this.color = sc.nextLine();
        System.out.print("Nhập kindOfFlower: ");
        this.kindOfFlower = sc.nextInt();
        sc.nextLine();
    }

    public void display() {
        System.out.println("Mã hoa: " + flowerId);
        System.out.println("Tên: " + flowerName);
        System.out.println("Màu: " + color);
        System.out.println("Số chủng loại: " + kindOfFlower);
    }
}
