package Lab09.BT2.motor;

import java.util.Scanner;

public class Motor implements IMotor {
    protected String code;
    protected String name;
    protected double capacity;
    protected int num;

    public Motor() {}

    public Motor(String code, String name, double capacity, int num) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.num = num;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập code: ");
        this.setCode(sc.nextLine());
        System.out.print("Nhập name: ");
        this.setName(sc.nextLine());
        System.out.print("Nhập capacity: ");
        this.setCapacity(sc.nextDouble());
        System.out.print("Nhập num: ");
        this.setNum(sc.nextInt());
    }

    @Override
    public void displayInfo() {
        System.out.println("Code: " + this.getCode());
        System.out.println("Name: " + this.getName());
        System.out.println("Capacity: " + this.getCapacity());
        System.out.println("Num: " + this.getNum());
    }

    @Override
    public void changeInfo() {
        inputInfo();
    }
}
