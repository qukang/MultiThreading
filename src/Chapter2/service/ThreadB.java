package Chapter2.service;

/**
 * Created by Omeprazole on 2017/7/13.
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.setUsernamePassword("b","bb",new Object());
    }
}
