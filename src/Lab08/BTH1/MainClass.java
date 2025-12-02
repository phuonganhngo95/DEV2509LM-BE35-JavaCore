package Lab08.BTH1;

import java.util.Scanner;

public class MainClass {
    public int showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n|=============MENU=============|");
        System.out.println("1. Tính diện tích hình tròn");
        System.out.println("2. Tính diện tích hình tứ giác");
        System.out.println("3. Tính diện tích hình tam giác");
        System.out.print("Vui lòng chọn từ 1-->3: ");
        return sc.nextInt();
    }

    public void tinhDienTich(Shape hinh) {
        hinh.inputData();
        hinh.calArea();
    }

    public static void main(String[] args) {
        MainClass main = new MainClass();
        int lc = 0;
        do {
            lc = main.showMenu();

            switch (lc) {
                case 1:
                    main.tinhDienTich(new Circle());
                    break;
                case 2:
                    main.tinhDienTich(new Rectangle());
                    break;
                case 3:
                    main.tinhDienTich(new Triangle());
                    break;
            }
        } while (lc>0 && lc<=3);
    }
}
