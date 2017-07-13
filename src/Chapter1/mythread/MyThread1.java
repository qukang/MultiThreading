package Chapter1.mythread;

import java.util.Random;

/**
 * Created by Omeprazole on 2017/7/13.
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for(int i =0;i<10;i++){
            for(int j = 0;j<50000;j++){
                Random random = new Random();
                random.nextInt();
                addResult = addResult+j;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("***** thread 1 use time ="+(endTime-beginTime));

    }
}
