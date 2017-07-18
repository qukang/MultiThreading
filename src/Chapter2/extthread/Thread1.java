package Chapter2.extthread;

import Chapter2.extobject.MyObject;

/**
 * Created by Omeprazole on 2017/7/13.
 */
public class Thread1 extends Thread{
    private MyObject object;

    public Thread1(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
