package Chapter4.Order;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by qukan on 2017/7/21.
 */
public class Run {
    volatile private static int nextPrintWho = 1;
    private static ReentrantLock lock = new ReentrantLock();
    final private static Condition conditionA = lock.newCondition();
    final private static Condition conditionB = lock.newCondition();
    final private static Condition conditionC = lock.newCondition();

    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while(nextPrintWho!=1){
                        conditionA.await();
                    }
                    for(int i = 0;i<3;i++){
                        System.out.println("A"+(i+1));
                    }
                    nextPrintWho = 2;
                    conditionB.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while(nextPrintWho!=2){
                        conditionB.await();
                    }
                    for(int i = 0;i<3;i++){
                        System.out.println("B"+(i+1));
                    }
                    nextPrintWho = 3;
                    conditionC.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while(nextPrintWho!=3){
                        conditionC.await();
                    }
                    for(int i = 0;i<3;i++){
                        System.out.println("C"+(i+1));
                    }
                    nextPrintWho = 1;
                    conditionA.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread[] aArrays = new Thread[5];
        Thread[] bArrays = new Thread[5];
        Thread[] cArrays = new Thread[5];
        for(int i = 0;i<5;i++){
            aArrays[i] = new Thread(threadA);
            bArrays[i] = new Thread(threadB);
            cArrays[i] = new Thread(threadC);
            aArrays[i].start();
            bArrays[i].start();
            cArrays[i].start();
        }

    }

}
