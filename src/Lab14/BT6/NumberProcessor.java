package Lab14.BT6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NumberProcessor {
    int currentNumber;
    boolean numberReady = false;
    final Lock lock = new ReentrantLock();
    final Condition condition = lock.newCondition();
}
