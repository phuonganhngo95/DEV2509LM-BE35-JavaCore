package Lab12.BT2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập số nguyên: ");
            int i = sc.nextInt();
            System.out.print("Nhập số thực: ");
            double d = sc.nextDouble();
            System.out.print("Nhập boolean: ");
            boolean b = sc.nextBoolean();
            System.out.print("Nhập kí tự: ");
            char c = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nhập chuỗi: ");
            String s = sc.nextLine();

            FileOutputStream fos = new FileOutputStream("data.dat");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(i);
            dos.writeDouble(d);
            dos.writeBoolean(b);
            dos.writeChar(c);
            dos.writeUTF(s);
            System.out.println("Ghi dữ liệu thành công");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
