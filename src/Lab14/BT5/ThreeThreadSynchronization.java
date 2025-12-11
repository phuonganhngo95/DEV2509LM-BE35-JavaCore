package Lab14.BT5;

public class ThreeThreadSynchronization {
    public static void main(String[] args) {
        SharedNumberData sharedData = new SharedNumberData();

        Thread numberGeneratorThread = new NumberGeneratorThread(sharedData);
        Thread evenNumberThread = new EvenNumberThread(sharedData);
        Thread oddNumberThread = new OddNumberThread(sharedData);

        numberGeneratorThread.setName("Generator");
        evenNumberThread.setName("EvenHandler");
        oddNumberThread.setName("OddHandler");

        numberGeneratorThread.start();
        evenNumberThread.start();
        oddNumberThread.start();

        try {
            Thread.sleep(15000);
            numberGeneratorThread.interrupt();
            evenNumberThread.interrupt();
            oddNumberThread.interrupt();

            numberGeneratorThread.join(1000);
            evenNumberThread.join(1000);
            oddNumberThread.join(1000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

