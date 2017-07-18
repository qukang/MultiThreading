package Chapter3.PR;

/**
 * Created by Omeprazole on 2017/7/18.
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP pthread= new ThreadP(p);
        ThreadC cthread = new ThreadC(c);
        pthread.start();
        cthread.start();
    }
}
