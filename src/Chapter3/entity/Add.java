package Chapter3.entity;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class Add {
    private String lock;
    public Add(String lock){
        super();
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
