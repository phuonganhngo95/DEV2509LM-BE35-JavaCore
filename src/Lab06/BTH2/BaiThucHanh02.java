package Lab06.BTH2;

import java.util.Scanner;

public class BaiThucHanh02 {
    String arr[][] = new String[3][2];

    public void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i+1));
            arr[i][0] = sc.nextLine();
            arr[i][1] = sc.nextLine();
        }
    }

    public void sapXep() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(Float.parseFloat(arr[j][1]) < (Float.parseFloat(arr[i][1]))) {
                    String temp[][] = new String[1][2];
                    temp[0][0] = arr[j][0];
                    temp[0][1] = arr[j][1];
                    arr[j][0] = arr[i][0];
                    arr[j][1] = arr[i][1];
                    arr[i][0] = temp[0][0];
                    arr[i][1] = temp[0][1];
                }
            }
        }
    }

    public void hienThi() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[1][0] + " - " + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        BaiThucHanh02 main = new BaiThucHanh02();
        main.nhapDuLieu();
        main.sapXep();
        main.hienThi();
    }
}
