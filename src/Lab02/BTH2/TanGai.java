package Lab02.BTH2;

import java.util.Scanner;

public class TanGai {
    public static void kiemTraCoGai(Scanner scanner) {
        System.out.println("1-Xinh, 2-Xấu. Bạn chọn (1/2): ");
        int ngoaiHinh = scanner.nextInt();

        if (ngoaiHinh == 1) {
            System.out.println("Gái xinh! Chuyển sang trọ cùng phòng");
            System.out.println("Kiểm tra có người yêu chưa? Y-Có, N-Chưa. Bạn chọn (Y/N): ");
            String coNguoiYeu = scanner.nextLine().trim().toUpperCase();

            if (coNguoiYeu.equals("N")) {
                System.out.println("Tán");
                System.out.println("Đồng ý đi ăn không? Y-Đồng ý, N-Không. Bạn chọn (Y/N): ");
                String dongY = scanner.nextLine().trim().toUpperCase();

                switch (dongY) {
                    case "Y":
                        System.out.println("Đưa đi ăn");
                        break;
                    case "N":
                        System.out.println("Tán");
                        break;
                    default:
                        System.out.println("Lựa chọn không phù hợp");
                }
            } else if (coNguoiYeu.equals("Y")) {
                System.out.println("Thì tán luôn bạn trai của nàng");
            } else {
                System.out.println("Lựa chọn không hợp lệ");
            }
        } else if (ngoaiHinh == 2) {
            System.out.println("Nhà mặt phố, bố làm to thì tôi đành nhắm 'tình yêu không biên giới'");
        } else {
            System.out.println("Lựa chọn không hợp lệ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        kiemTraCoGai(scanner);
    }
}