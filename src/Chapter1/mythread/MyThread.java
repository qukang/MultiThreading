package Chapter1.mythread;

/**
 * Created by Omeprazole on 2017/7/12.
 */

public class MyThread extends Thread{

    private int count = 5;

    public MyThread(String Name) {
        super();
        this.setName(Name);
    }

    public MyThread(){
        super();
    }

    @Override
    /**
     * 测试线程与主线程的调用顺序关系
     */
/*
    public void run() {
        */
/*super.run();
        System.out.println("MyThread");*//*

    }
*/

    /**
     * 测试线程间的调用关系
     */
/*    public void run(){
        try{
            for(int i = 0;i<10;i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }*/
/*    public void run(){
        super.run();
        while(count>0){
            count--;
            System.out.println("this is "+this.currentThread().getName()+": "+count);
        }
    }*/

    /*synchronized public void run() {
        super.run();
        System.out.println("this is " + this.getName() + ": " + --count);
    }*/

/*    public void run(){
        super.run();
        try{
            long beginTime = System.currentTimeMillis();
            for(int i =0 ;i<500000;i++){
                if(this.isInterrupted()){
                    System.out.println("stop!!!!!");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Time:"+(endTime-beginTime)+"MS");
        }catch (InterruptedException e){
            System.out.println("in the catch");
            e.printStackTrace();
        }
    }*/
    public void run(){
        super.run();
        long beginTime = System.currentTimeMillis();
        int count = 0;
        System.out.println(this.getPriority());
        for(int i =0 ;i<500000;i++){
            Thread.yield();
            count++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time:"+(endTime-beginTime)+"MS");
    }




}
