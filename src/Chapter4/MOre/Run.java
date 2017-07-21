package Chapter4.MOre;

/**
 * Created by qukan on 2017/7/19.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                service.awaitA();
            }
        });
        a.setName("A");
        a.start();
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                service.awaitB();
            }
        });
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        service.signalAll_A();
    }
}
