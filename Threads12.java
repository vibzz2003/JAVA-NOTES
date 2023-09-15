import java.util.*;
class Threads12 extends Thread{
    public static void main(String args[]){
        Thread.currentThread().setPriority(17);
        System.out.println("The priority of the current thread is :"+ Thread.currentThread().getPriority());
    }
}
// priority cant be above 10