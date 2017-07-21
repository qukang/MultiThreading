package Chapter4.Fair;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by qukan on 2017/7/19.
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        this.lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("ThreadName get lock: "+Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
}
