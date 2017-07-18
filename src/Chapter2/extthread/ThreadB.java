package Chapter2.extthread;

import Chapter2.service.HasSelfPrivateNum;

/**
 * Created by Omeprazole on 2017/7/13.
 */
public class ThreadB extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
