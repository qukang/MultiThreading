package Chapter3.ThreadLocal2;

import java.util.Date;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class Run {
    public static void main(String[] args) {
        try {
            Thread a = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for(int i =0 ;i<20;i++){
                            if(Tools.t1.get()==null){
                                Tools.t1.set(new Date());
                            }
                            System.out.println("A " + Tools.t1.get().getTime());
                            Thread.sleep(100);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            a.start();

            Thread.sleep(1000);

            Thread b = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for(int i =0 ;i<20;i++){
                            if(Tools.t1.get()==null){
                                Tools.t1.set(new Date());
                            }
                            System.out.println("B " + Tools.t1.get().getTime());
                            Thread.sleep(100);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
