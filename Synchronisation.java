//Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
//Java Synchronization is better option where we want to allow only one thread to access the shared resource.

//The synchronization is mainly used to

//To prevent thread interference.
//To prevent consistency problem.

//two types of synchronisation:
//process
//thread

//Thread Sychronisation :
//1. Mutual Exclusion:
//    1.1 Synchronized method.
//    1.2 Synchronized block.
//    1.3 Static synchronization.

//2. Cooperation(inter thread)

class Table{
    void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Thread1 extends Thread{
    Table t;
    Thread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
class Thread2 extends Thread{
    Table t;
    Thread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}
class Sychronisation{
    public static void main(String args[]){
        Table obj = new Table();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}