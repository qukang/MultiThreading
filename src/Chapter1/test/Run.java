package Chapter1.test;
import Chapter1.mythread.DeamonThread;
import Chapter1.mythread.MyThread;
import Chapter1.myrunnable.MyRunnable;
import Chapter1.mythread.MyThread1;
import Chapter1.mythread.MyThread2;

/**
 * Created by Omeprazole on 2017/7/12.
 */
public class Run {
/*    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("work done!");
    }*/

    /*public static void main(String[] args) {
        try{
            MyThread myThread = new MyThread();
            myThread.setName("myThread");
            myThread.start();
            for(int i =0 ;i<10;i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }*/


/*    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        runnable.run();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("work done");
    }*/

    /*public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }*/

   /* public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getId()+":"+runThread.getName());
    }*/

    /*public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            thread.sleep(1000);
            System.out.println("thread.isAlive() = " + thread.isAlive());
            System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
            System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
            System.out.println("thread.isAlive() = " + thread.isAlive());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }*/
/*    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        MyThread myThread = new MyThread();
        myThread.start();
    }*/

/*   public static void main(String[] args) {
       for(int i =0;i<5;i++){
           MyThread1 thread1 = new MyThread1();
           thread1.setPriority(5);
            thread1.start();
            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(6);
            thread2.start();
        }
    }*/

    public static void main(String[] args) {
        try {
            DeamonThread thread = new DeamonThread();
            thread.setDaemon(false);
            thread.start();
            Thread.sleep(5000);
            System.out.println("stop!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
