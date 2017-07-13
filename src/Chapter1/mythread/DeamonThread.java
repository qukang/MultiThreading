package Chapter1.mythread;

/**
 * Created by Omeprazole on 2017/7/13.
 */
public class DeamonThread extends Thread{

    private  int i =0;
    @Override
    public void run() {
        try {
            while(true){
                i++;
                System.out.println("i="+(i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
