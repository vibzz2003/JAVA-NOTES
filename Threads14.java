import java.util.*;
class Threads14 extends Thread{
    public void run(){
        System.out.println("running...");
        System.out.println("Name : " + Thread.currentThread().getName());
        System.out.println("Deamon : " + Thread.currentThread().isDeamon());
    }
    public static void main(String args[]){
        Threads14 t1 =  new Threads14();
        Threads14 t2 =  new Threads14();
        Threads14 t3 =  new Threads14();

        t1.start();
        t1.setDeamon(true);

        t2.start();
        t3.start();
    }
}
//cant set deamon thread if u have already started it 