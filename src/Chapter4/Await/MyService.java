package Chapter4.Await;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by qukan on 2017/7/19.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try {
            lock.lock();
            System.out.println("A "+ System.currentTimeMillis());
            condition.await();
            System.out.println("B "+ System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("C "+ System.currentTimeMillis());
        }
    }

    public void signal(){
        try {
            lock.lock();
            System.out.println("signal "+ System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
