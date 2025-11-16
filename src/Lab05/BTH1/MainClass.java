package Lab05.BTH1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ: ");
        float nhietDo = sc.nextFloat();
        sc.nextLine();
        System.out.print("Nhiệt độ vừa nhập (C/F): ");
        char type = sc.next().charAt(0);
        ConvertTemperature c = new ConvertTemperature();

        switch (type) {
            case 'C':
                c.convert(nhietDo, true);
                break;
            case 'F':
                c.convert(nhietDo, false);
                break;
        }
    }
}
