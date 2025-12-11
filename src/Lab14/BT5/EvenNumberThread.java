package Lab14.BT5;

public class EvenNumberThread extends Thread {
    private SharedNumberData sharedData;

    public EvenNumberThread(SharedNumberData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        try {
            while (sharedData.shouldContinue()) {
                sharedData.processEvenNumber();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread EvenHandler đã dừng");
        }
    }
}
