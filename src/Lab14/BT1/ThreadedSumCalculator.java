package Lab14.BT1;

import java.util.Scanner;

public class ThreadedSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số luồng: ");
        int numThreads = scanner.nextInt();
        scanner.close();

        int range = n / numThreads;
        int remainder = n % numThreads;

        SumThread[] threads = new SumThread[numThreads];
        int start = 1;
        for (int i = 0; i < numThreads; i++) {
            int end = start + range - 1;
            if (i < remainder) {
                end += 1;
            }
            if (end > n) {
                end = n;
            }
            threads[i] = new SumThread(start, end, i + 1);
            threads[i].start();
            start = end + 1;
        }
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            totalSum += threads[i].getPartialSum();
        }

        System.out.println("\nKết quả:");
        System.out.println("Tổng của các số từ 1 đến " + n + " là: " + totalSum);

        for (int i = 0; i < numThreads; i++) {
            System.out.println("Luồng " + (i + 1) + " tính tổng từ " + 
                             threads[i].getStart() + " đến " + 
                             threads[i].getEnd() + " = " + 
                             threads[i].getPartialSum());
        }
    }
}

