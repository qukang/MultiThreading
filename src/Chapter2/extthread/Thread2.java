package Chapter2.extthread;

import Chapter2.extobject.MyObject;

/**
 * Created by Omeprazole on 2017/7/13.
 */
public class Thread2 extends Thread {
    private MyObject object;

    public Thread2(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
