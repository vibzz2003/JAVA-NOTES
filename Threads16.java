//using multi threads to do one work
class Threads16 extends Thread{
    public void run(){
        System.out.println("runnning...");
    }
    public static void main(String args[]){
        Threads16 t1 = new Threads16();
        Threads16 t2 = new Threads16();
        Threads16 t3 = new Threads16();

        t1.start();
        t2.start();
        t3.start();
    }
}