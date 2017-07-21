package Chapter4.Fair;

/**
 * Created by qukan on 2017/7/19.
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread start: "+ Thread.currentThread().getName());
                service.serviceMethod();
            }
        };
        Thread[] threads = new Thread[10];
        for(int i =0 ;i<10;i++){
            threads[i] = new Thread(runnable);
        }

        for(int i =0;i<10;i++){
            threads[i].start();
        }
    }
}
