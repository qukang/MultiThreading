package Chapter4.ReadWrite;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by qukan on 2017/7/21.
 */
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void read(){
        try {
            lock.readLock().lock();
            System.out.println("get read lock "+Thread.currentThread().getName() + System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }
    public void write(){
        try {
            lock.writeLock().lock();
            System.out.println("get write lock "+Thread.currentThread().getName() + System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}
