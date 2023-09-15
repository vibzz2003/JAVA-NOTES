class Threads1 implements Runnable{
    public void run(){
        System.out.println("is running");
    }

    public static void main(String args[]){
        Threads1 t = new Threads1();
        Thread t1 = new Thread(t);
        t1.start();
    }
}