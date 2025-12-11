package Lab14.BT6;

import java.util.Random;

public class SimpleEvenOdd {
    public static void main(String[] args) {
        final int[] number = new int[1];
        final boolean[] ready = new boolean[1];
        final Object lock = new Object();

        new Thread(() -> {
            Random rand = new Random();
            for (int i = 0; i < 5; i++) {
                synchronized (lock) {
                    while (ready[0]) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                        }
                    }

                    number[0] = rand.nextInt(100) + 1;
                    ready[0] = true;
                    System.out.println("Sinh số: " + number[0]);
                    lock.notify();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronized (lock) {
                    while (!ready[0]) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                        }
                    }
                    String result = (number[0] % 2 == 0) ? "chẵn" : "lẻ";
                    System.out.println("Kiểm tra: " + number[0] + " là số " + result + "\n");
                    ready[0] = false;
                    lock.notify();
                }
            }
        }).start();
    }
}
