package Lab02.B10;

import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kí tự: ");
        char kt = sc.next().charAt(0);

        switch (kt) {
            case 'R': case 'r':
                System.out.println("RED");
                break;
            case 'G': case 'g':
                System.out.println("GREEN");
                break;
            case 'B': case 'b':
                System.out.println("BLUE");
            default:
                System.out.println("BLACK");
                break;
        }
    }
}
