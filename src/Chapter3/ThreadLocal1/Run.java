package Chapter3.ThreadLocal1;

import Chapter3.PR.P;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class Run {
    public static void main(String[] args) {
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i =0 ;i<100;i++){
                        Tools.t1.set("ThreadA"+(i+1));
                        System.out.println("ThreadA get Value = " + Tools.t1.get());
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i =0 ;i<100;i++){
                        Tools.t1.set("ThreadB"+(i+1));
                        System.out.println("ThreadB get Value = " + Tools.t1.get());
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        a.start();
        b.start();

        try {
            for(int i =0 ;i<100;i++) {
                Tools.t1.set("Main"+(i+1));
                System.out.println("Main get Value = " + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
