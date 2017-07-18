package Chapter3.PR;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class ThreadC extends Thread
{
    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while(true){
            c.getValue();
        }
    }
}
