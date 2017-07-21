package Chapter4.ReadWrite;

import java.util.PriorityQueue;

/**
 * Created by qukan on 2017/7/21.
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            Thread a =new Thread(new Runnable() {
                @Override
                public void run() {
                    service.read();
                }
            });
            a.setName("A");

            Thread b = new Thread(new Runnable() {
                @Override
                public void run() {
                    service.write();
                }
            });
            b.setName("B");
            a.start();
            Thread.sleep(100);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
