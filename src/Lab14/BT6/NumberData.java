package Lab14.BT6;

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
        notify();
    }

    public synchronized void checkNumber() throws InterruptedException {
        while (!numberReady) {
            wait();
        }
        String result;
        if (currentNumber % 2 == 0) {
            result = "CHẴN";
        } else {
            result = "LẺ";
        }
        System.out.println("[Checker] Số " + currentNumber + " là số " + result);
        numberReady = false;
        isProcessed = true;
        notify();
    }

    public boolean shouldContinue() {
        return !Thread.currentThread().isInterrupted();
    }
}
