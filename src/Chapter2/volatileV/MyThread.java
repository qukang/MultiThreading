package Chapter2.volatileV;

/**
 * Created by Omeprazole on 2017/7/17.
 */
public class MyThread extends Thread{
    volatile public static int count;
    private static void addCount(){
        for(int i =0 ;i<100;i++){
            count++;
        }
        System.out.println("count = " + count);
    }

    @Override
    public void run(){
        addCount();
    }
}
