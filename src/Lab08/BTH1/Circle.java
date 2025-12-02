package Lab08.BTH1;

import java.util.Scanner;

public class Circle extends Shape {
    float radius;

    @Override
    public void inputData() {
        System.out.print("Nhập bán kính hình tròn: ");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();
    }

    @Override
    public void calArea() {
        float area = (float) (radius*radius*Math.PI);
        System.out.printf("Diện tích hình tròn là: %.2f", area);
    }
}
