package Chapter2.extobject;

/**
 * Created by Omeprazole on 2017/7/13.
 */
public class MyObject {
    synchronized public void methodA(){
        try {
            System.out.println("begin MethodA threadName = "+ Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void methodB(){
        try {
            System.out.println("begin MethodB threadName = "+ Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
