package Lab02.B9;

import java.util.Scanner;

public class KeoBaoBua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Kéo");
        System.out.println("2: Búa");
        System.out.println("3: Bao");

        System.out.print("Người chơi 1 (nhập số 1, 2, hoặc 3): ");
        int choice1 = scanner.nextInt();
        System.out.print("Người chơi 2 (nhập số 1, 2, hoặc 3): ");
        int choice2 = scanner.nextInt();
        String result = "";
        if ((choice1 < 1 || choice1 > 3) || (choice2 < 1 || choice2 > 3)) {
            System.out.println("Lựa chọn không hợp lệ. Vui lòng chỉ nhập 1, 2 hoặc 3.");
            scanner.close();
            return;
        }

        switch (choice1) {
            case 1:
                System.out.print("Người chơi 1 chọn Kéo, ");
                switch (choice2) {
                    case 1:
                        System.out.println("Người chơi 2 chọn Kéo.");
                        result = "Hòa!";
                        break;
                    case 2:
                        System.out.println("Người chơi 2 chọn Búa.");
                        result = "Người chơi 2 thắng!";
                        break;
                    case 3:
                        System.out.println("Người chơi 2 chọn Bao.");
                        result = "Người chơi 1 thắng!";
                        break;
                }
                break;
            case 2:
                System.out.print("Người chơi 1 chọn Búa, ");
                switch (choice2) {
                    case 1:
                        System.out.println("Người chơi 2 chọn Kéo.");
                        result = "Người chơi 1 thắng!";
                        break;
                    case 2:
                        System.out.println("Người chơi 2 chọn Búa.");
                        result = "Hòa!";
                        break;
                    case 3:
                        System.out.println("Người chơi 2 chọn Bao.");
                        result = "Người chơi 2 thắng!";
                        break;
                }
                break;
            case 3:
                System.out.print("Người chơi 1 chọn Bao, ");
                switch (choice2) {
                    case 1:
                        System.out.println("Người chơi 2 chọn Kéo.");
                        result = "Người chơi 2 thắng!";
                        break;
                    case 2:
                        System.out.println("Người chơi 2 chọn Búa.");
                        result = "Người chơi 1 thắng!";
                        break;
                    case 3:
                        System.out.println("Người chơi 2 chọn Bao.");
                        result = "Hòa!";
                        break;
                }
                break;
        }
        System.out.println("\nKết quả: " + result);
    }
}