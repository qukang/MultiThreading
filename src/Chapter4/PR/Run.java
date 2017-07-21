package Chapter4.PR;

/**
 * Created by qukan on 2017/7/19.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Myservice service = new Myservice();
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    service.set();
                }
            }
        });
        a.start();
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    service.get();
                }
            }
        });
        b.start();
    }
}
