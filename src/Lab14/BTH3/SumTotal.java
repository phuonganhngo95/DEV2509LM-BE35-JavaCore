package Lab14.BTH3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SumTotal extends Thread {
    int startNumber, endNumber;
    int total = 0;

    public SumTotal(String name, int startNum, int endNum) {
        super(name);
        this.startNumber = startNum;
        this.endNumber = endNum;
    }

    @Override
    public void run() {
        for (int i = startNumber; i <= endNumber; i++) {
            total += i;
            System.out.println(getName() + " is alive: " + isAlive());
            try {
                Thread.sleep(110);
            } catch (InterruptedException e) {
                Logger.getLogger(SumTotal.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
