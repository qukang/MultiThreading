package Chapter3.PR;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class ThreadP extends Thread{
    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while(true){
            p.setValue();
        }
    }
}
