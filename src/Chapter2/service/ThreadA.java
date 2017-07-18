package Chapter2.service;

/**
 * Created by Omeprazole on 2017/7/13.
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.setUsernamePassword("a","aa",new Object());
    }
}
