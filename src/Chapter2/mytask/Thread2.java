package Chapter2.mytask;

import Chapter2.extobject.MyObject;

/**
 * Created by Omeprazole on 2017/7/13.
 */
public class Thread2 extends Thread {
    private Task task;

    public Thread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
