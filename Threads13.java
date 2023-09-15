//Daemon thread in Java is a service provider thread that provides services to the user thread. 
//Its life depend on the mercy of user threads i.e. 
//when all the user threads dies, JVM terminates this thread automatically.

//There are many java daemon threads running automatically e.g. gc, finalizer etc.
//It is a low priority thread.
class Threads13 extends Thread{
    public void run(){
        System.out.println("running...");
        if(Thread.currentThread().isDaemon()){
            System.out.println("is a daemon thread");
        }
        else{
            System.out.println("is a user thread");
        }
    }
    public static void main(String args[]){
        Threads13 t1 = new Threads13();
        Threads13 t2 = new Threads13();
        Threads13 t3 = new Threads13();

        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}