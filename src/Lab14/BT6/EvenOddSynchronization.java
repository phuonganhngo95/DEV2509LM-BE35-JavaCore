package Lab14.BT6;

public class EvenOddSynchronization {
    public static void main(String[] args) {
        NumberData sharedData = new NumberData();
        Thread numberGenerator = new NumberGenerator(sharedData);
        Thread numberChecker = new NumberChecker(sharedData);

        numberGenerator.setName("Generator");
        numberChecker.setName("Checker");

        numberGenerator.start();
        numberChecker.start();

        try {
            Thread.sleep(10000);
            numberGenerator.interrupt();
            numberChecker.interrupt();

            numberGenerator.join(1000);
            numberChecker.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

