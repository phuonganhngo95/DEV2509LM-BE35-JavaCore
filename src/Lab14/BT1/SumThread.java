package Lab14.BT1;

public class SumThread extends Thread {
    private int start;
    private int end;
    private int threadId;
    private long partialSum;

    public SumThread(int start, int end, int threadId) {
        this.start = start;
        this.end = end;
        this.threadId = threadId;
        this.partialSum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }

        System.out.println("Luồng " + threadId + " tổng = " + partialSum);
    }

    public long getPartialSum() {
        return partialSum;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
