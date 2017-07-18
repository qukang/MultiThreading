package Chapter3;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true){
                if(list.size()==5){
                    System.out.println("size is 5, b is stoping");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
