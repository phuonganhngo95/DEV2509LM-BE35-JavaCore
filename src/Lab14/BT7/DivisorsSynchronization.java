package Lab14.BT7;

public class DivisorsSynchronization {
    public static void main(String[] args) {
        NumberData sharedData = new NumberData();
        Thread numberGenerator = new NumberGenerator(sharedData);
        Thread divisorFinder = new DivisorFinder(sharedData);

        numberGenerator.setName("Generator");
        divisorFinder.setName("DivisorFinder");

        numberGenerator.start();
        divisorFinder.start();

        try {
            Thread.sleep(15000);

            numberGenerator.interrupt();
            divisorFinder.interrupt();

            numberGenerator.join(1000);
            divisorFinder.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

