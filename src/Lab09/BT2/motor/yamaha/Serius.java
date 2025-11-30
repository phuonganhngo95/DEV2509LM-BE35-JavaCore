package Lab09.BT2.motor.yamaha;

import Lab09.BT2.motor.Motor;

import java.util.Scanner;

public class Serius extends Motor {
    private int warranty;

    public Serius() {
        super();
    }

    public Serius(String code, String name, double capacity, int num, int warranty) {
        super(code, name, capacity, num);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        super.inputInfo();
        System.out.print("Nhập warranty: ");
        this.setWarranty(sc.nextInt());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + this.getWarranty());
    }

    @Override
    public void changeInfo() {
        super.changeInfo();
        inputInfo();
    }
}
