//runnable interface
class Q_2 implements Runnable{
    public void run(){
        System.out.println("the thread is runnign but in an interace");
    }

    public static void main(String args[]){
        Q_2 t1 = new Q_2();
        Thread t = new Thread(t1);
        t.start();
    }
}