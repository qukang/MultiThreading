package Chapter2.volatileV;

/**
 * Created by Omeprazole on 2017/7/17.
 */
public class Run {
    /*public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("set false!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for(int i =0 ;i<100;i++){
            myThreads[i] = new MyThread();
        }
        for(int i = 0;i<100;i++){
            myThreads[i].start();
        }
    }
}
