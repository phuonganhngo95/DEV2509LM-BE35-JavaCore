package Lab14.BT7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberData {
    private int currentNumber;
    private boolean numberReady = false;
    private boolean isProcessed = true;

    public synchronized void generateNumber() throws InterruptedException {
        while (!isProcessed) {
            wait();
        }
        Random random = new Random();
        currentNumber = random.nextInt(100) + 1;

        numberReady = true;
        isProcessed = false;

        System.out.println("[Generator] Đã sinh số: " + currentNumber);
        notify();
    }

    public synchronized void findDivisors() throws InterruptedException {
        while (!numberReady) {
            wait();
        }
        List<Integer> divisors = findDivisors(currentNumber);

        System.out.println("[DivisorFinder] Các ước số của " + currentNumber + ":");
        System.out.print("   ");
        for (int i = 0; i < divisors.size(); i++) {
            System.out.print(divisors.get(i));
            if (i < divisors.size() - 1) {
                System.out.print(", ");
            }
            if ((i + 1) % 10 == 0 && i < divisors.size() - 1) {
                System.out.print("\n   ");
            }
        }
        System.out.println("\n   Tổng cộng: " + divisors.size() + " ước số");
        numberReady = false;
        isProcessed = true;
        notify();
    }

    private List<Integer> findDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public boolean shouldContinue() {
        return !Thread.currentThread().isInterrupted();
    }
}
