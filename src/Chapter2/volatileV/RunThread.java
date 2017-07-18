package Chapter2.volatileV;

/**
 * Created by Omeprazole on 2017/7/17.
 */
public class RunThread extends Thread{
    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("in");
        while(isRunning==true){
        }
        System.out.println("out");
    }
}
