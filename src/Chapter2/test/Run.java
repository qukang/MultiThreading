package Chapter2.test;

import Chapter1.mythread.MyThread1;
import Chapter1.mythread.MyThread2;
import Chapter2.extobject.MyObject;
/*import Chapter2.extthread.Thread1;
import Chapter2.extthread.Thread2;*/
import Chapter2.extthread.ThreadA;
import Chapter2.extthread.ThreadB;
import Chapter2.mytask.Task;
import Chapter2.mytask.Thread2;
import Chapter2.mytask.Thread1;

import Chapter2.service.HasSelfPrivateNum;

/**
 * Created by Omeprazole on 2017/7/13.
 */
public class Run {
/*    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA athread = new ThreadA(numRef1);
        athread.start();
        ThreadB bthread = new ThreadB(numRef1);
        bthread.start();
    }*/

    /*public static void main(String[] args) {
        MyObject object = new MyObject();
        Thread1 a = new Thread1(object);
        a.setName("A");
        Thread2 b = new Thread2(object);
        b.setName("B");
        a.start();
        b.start();
    }*/
    public static void main(String[] args) {
        Task task = new Task();
        Thread1 thread1 = new Thread1(task);
        thread1.start();
        Thread2 thread2 = new Thread2(task);
        thread2.start();
    }
}
