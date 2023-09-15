//Synchronized block can be used to perform synchronization on any specific resource of the method.
//Suppose we have 50 lines of code in our method, but we want to synchronize only 5 lines, in such cases, we can use synchronized block.
//Synchronized block is used to lock an object for any shared resource.
//Scope of synchronized block is smaller than the method.
//A Java synchronized block doesn't allow more than one JVM, to provide access control to a shared resource.
//The system performance may degrade because of the slower working of synchronized keyword.
//Java synchronized block is more efficient than Java synchronized method.
class Table{
    void printTable(int n){
         synchronized(this){
            for(int i=1;i<=5;i++){
                System.out.println(i*n);
                try{
                    Thread.sleep(400);
                }
                catch(Exception e){
                   System.out.println(e);
                }
            }
        }
    }
}

class Thread1 extends Thread{
    Table t;
    Thread1(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}

class Thread2 extends Thread{
    Table t;
    Thread2(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class S_block{
    public static void main(String args[]){
        Table a = new Table();
        Thread1 t1 = new Thread1(a);
        Thread2 t2 = new Thread2(a);
        t1.start();
        t2.start();
    }
}