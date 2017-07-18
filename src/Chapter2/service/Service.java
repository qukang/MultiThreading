package Chapter2.service;

import Chapter2.extthread.Thread1;

/**
 * Created by Omeprazole on 2017/7/13.
 */
public class Service {
    private String usernameParam;
    private String passwordParam;
/*
    private String anyString = new String();
*/
    public void setUsernamePassword(String username,String password,Object object){
        try {
            synchronized (object){
                System.out.println(Thread.currentThread().getName()+" in");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println(Thread.currentThread().getName()+" out");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
