package Chapter3.PR;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class P {
    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue(){
        try {
            synchronized (lock){
                if(!ValueObject.value.equals("")){
                    lock.wait();
                }
                String value = System.currentTimeMillis()+"_"+System.nanoTime();
                System.out.println("value = " + value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
