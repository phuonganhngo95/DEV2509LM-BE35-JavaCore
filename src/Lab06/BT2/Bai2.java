package Lab06.BT2;

import java.util.Random;

public class Bai2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        System.out.print("Nhập mảng: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
    }
}
