package Chapter4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by qukan on 2017/7/19.
 */
public class Myservice {
    private Lock lock = new ReentrantLock();
    public void testtMethod(){
        lock.lock();
        for(int i = 0;i<5;i++){
            System.out.println("Thread.currentThread().getName( )= " + Thread.currentThread().getName( )+(i+1));
        }
        lock.unlock();
    }
}
