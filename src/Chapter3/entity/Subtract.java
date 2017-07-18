package Chapter3.entity;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class Subtract {
    private String lock;

    public Subtract(String lock) {
        super();
        this.lock = lock;
    }
    public void substract(){
        try {
            synchronized (lock){
                while(ValueObject.list.size()==0){
                    System.out.println("wait begin "+ Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end "+ Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("ValueObject.list.size() = " + ValueObject.list.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
