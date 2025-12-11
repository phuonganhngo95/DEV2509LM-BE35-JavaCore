package Lab14.BT7;

import java.util.Random;

public class SimpleDivisors {
    public static void main(String[] args) {
        final int[] number = new int[1];
        final boolean[] ready = new boolean[1];
        final Object lock = new Object();

        Thread generator = new Thread(() -> {
            Random rand = new Random();
            for (int i = 1; i <= 5; i++) {
                synchronized (lock) {
                    while (ready[0]) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                        }
                    }

                    number[0] = rand.nextInt(100) + 1;
                    ready[0] = true;
                    System.out.println("\n[Lần " + i + "] Sinh số: " + number[0]);
                    lock.notify();
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });

        Thread finder = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                synchronized (lock) {
                    while (!ready[0]) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                        }
                    }
                    System.out.print("Ước số của " + number[0] + ": ");

                    int count = 0;
                    for (int j = 1; j <= number[0]; j++) {
                        if (number[0] % j == 0) {
                            System.out.print(j);
                            count++;
                            if (j < number[0]) {
                                System.out.print(", ");
                            }
                            if (count % 10 == 0 && j < number[0]) {
                                System.out.print("\n                ");
                            }
                        }
                    }
                    System.out.println("\nTổng: " + count + " ước số");
                    ready[0] = false;
                    lock.notify();
                }
            }
        });

        generator.start();
        finder.start();

        try {
            generator.join();
            finder.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
