package Chapter3.entity;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class ThreadSubtract extends Thread{
    private Subtract r;

    public ThreadSubtract(Subtract r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        r.substract();
    }
}
