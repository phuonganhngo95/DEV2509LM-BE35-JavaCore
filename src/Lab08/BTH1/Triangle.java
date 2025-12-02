package Lab08.BTH1;

import java.util.Scanner;

public class Triangle extends Shape {
    float height, bottom;

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        height = sc.nextFloat();
        System.out.print("Nhập cạnh đáy: ");
        bottom = sc.nextFloat();
    }

    @Override
    public void calArea() {
        float area = (bottom*height) / 2;
        System.out.printf("Diện tích tam giác là: %.2f", area);
    }
}
