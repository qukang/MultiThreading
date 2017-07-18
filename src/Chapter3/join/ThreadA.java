package Chapter3.join;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class ThreadA extends Thread{
    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b){
                b.start();
                /*Thread.sleep(6000);*/
                b.join();
                for(int i = 0;i<Integer.MAX_VALUE;i++){
                    String newString = new String();
                    Math.random();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


