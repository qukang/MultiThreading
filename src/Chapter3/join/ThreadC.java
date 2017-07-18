package Chapter3.join;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class ThreadC extends Thread{
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
