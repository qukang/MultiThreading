package Chapter4;

/**
 * Created by qukan on 2017/7/19.
 */
public class Run {

    public static void main(String[] args) {
        Myservice myservice = new Myservice();
        MyThread a1 = new MyThread(myservice);
        MyThread a2 = new MyThread(myservice);
        MyThread a3 = new MyThread(myservice);
        MyThread a4 = new MyThread(myservice);
        MyThread a5 = new MyThread(myservice);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();

    }

}

class MyThread extends Thread{
    private Myservice service;

    public MyThread(Myservice service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testtMethod();
    }
}
