package Lab08.BTH1;

import java.util.Scanner;

public class Rectangle extends Shape {
    float width, height;

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        width = sc.nextFloat();
        System.out.print("Nhập chiều dài: ");
        height = sc.nextFloat();
    }

    @Override
    public void calArea() {
        float area = width * height;
        System.out.printf("Diện tích tứ giác là: %.2f", area);
    }
}
