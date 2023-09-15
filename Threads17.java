//same as threads16.java but with runnable interface
class Threads17 implements Runnable{
    public void run(){
        System.out.println("runnning...");
    }
    public static void main(String args[]){
        Thread t1 = new Thread(new Threads17());
        Thread t2 = new Thread(new Threads17());

        t1.start();
        t2.start();
    }
}
//each thread is a seperate call stack