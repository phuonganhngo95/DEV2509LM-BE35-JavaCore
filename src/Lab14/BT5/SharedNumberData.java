package Lab14.BT5;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedNumberData {
    private int currentNumber;
    private boolean numberReady = false;
    private boolean isEven = false;
    private boolean isProcessed = true;

    private final Lock lock = new ReentrantLock();
    private final Condition numberGenerated = lock.newCondition();
    private final Condition evenProcessed = lock.newCondition();
    private final Condition oddProcessed = lock.newCondition();

    public void generateAndClassifyNumber() throws InterruptedException {
        lock.lock();
        try {
            while (!isProcessed) {
                numberGenerated.await();
            }
            Random random = new Random();
            currentNumber = random.nextInt(51);

            isEven = (currentNumber % 2 == 0);
            numberReady = true;
            isProcessed = false;

            System.out.println("\n[Generator] Đã sinh số: " + currentNumber +
                    " (" + (isEven ? "CHẴN" : "LẺ") + ")");
            if (isEven) {
                evenProcessed.signal();
            } else {
                oddProcessed.signal();
            }
        } finally {
            lock.unlock();
        }
    }

    public void processEvenNumber() throws InterruptedException {
        lock.lock();
        try {
            while (!numberReady || !isEven) {
                evenProcessed.await();
            }
            System.out.println("[EvenHandler] Xử lý số chẵn: " + currentNumber);
            System.out.print("   Ước số của " + currentNumber + ": ");

            if (currentNumber == 0) {
                System.out.println("Số 0 có vô số ước số");
            } else {
                for (int i = 1; i <= currentNumber; i++) {
                    if (currentNumber % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
            markAsProcessed();
        } finally {
            lock.unlock();
        }
    }

    public void processOddNumber() throws InterruptedException {
        lock.lock();
        try {
            while (!numberReady || isEven) {
                oddProcessed.await();
            }

            System.out.println("[OddHandler] Xử lý số lẻ: " + currentNumber);
            int square = currentNumber * currentNumber;
            System.out.println("   Bình phương của " + currentNumber + " là: " + square);
            markAsProcessed();
        } finally {
            lock.unlock();
        }
    }

    private void markAsProcessed() {
        numberReady = false;
        isProcessed = true;
        numberGenerated.signal();
    }

    public boolean shouldContinue() {
        return !Thread.currentThread().isInterrupted();
    }
}
