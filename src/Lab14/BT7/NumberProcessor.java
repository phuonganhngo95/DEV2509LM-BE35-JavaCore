package Lab14.BT7;

public class NumberProcessor {
    int currentNumber;
    boolean numberReady = false;
    final java.util.concurrent.locks.Lock lock = new java.util.concurrent.locks.ReentrantLock();
    final java.util.concurrent.locks.Condition condition = lock.newCondition();
}
