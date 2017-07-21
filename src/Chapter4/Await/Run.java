package Chapter4.Await;

/**
 * Created by qukan on 2017/7/19.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                service.await();
            }
        });
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}
