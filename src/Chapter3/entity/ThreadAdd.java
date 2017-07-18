package Chapter3.entity;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class ThreadAdd extends Thread {
    private Add p;

    public ThreadAdd(Add p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
