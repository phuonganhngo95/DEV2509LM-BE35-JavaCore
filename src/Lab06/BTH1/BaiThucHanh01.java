package Lab06.BTH1;

import java.util.Scanner;

public class BaiThucHanh01 {
    public static void main(String[] args) {
        String[] arr = new String[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        for (String arr1 : arr) {
            System.out.println(arr1);
        }
    }
}
