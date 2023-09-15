import java.io.*;
class Threadjoin extends Thread{
    public void run(){
    for(int i = 0; i < 3; i++){
        try{
            Thread.sleep(300);
            System.out.println("THE CURRENT THREAD IS :" + Thread.currentThread().getName());
        }
        catch(Exception e){
            System.out.println("The exception is handled" + e);
        }
        System.out.println(i);
    }
    }
}
public class Threads8{
    public static void main(String args[]){
        Threadjoin t1 = new Threadjoin();
        Threadjoin t2 = new Threadjoin();
        Threadjoin t3 = new Threadjoin();

        t1.start();
        try{
            System.out.println("THE CURRENT THREAD IS :" + Thread.currentThread().getName());
            t1.join();
        }
        catch(Exception e){
            System.out.println("EXCEPTION HAS BEEN CAUGHT" + e);
        }

        t2.start();
        try{
            System.out.println("THE CURRENT THREAD IS :" + Thread.currentThread().getName());
            t2.join();
        }
        catch(Exception e){
            System.out.println("EXCEPTION HAS BEEN CAUGHT" + e);
        }

        t3.start();
    }
}