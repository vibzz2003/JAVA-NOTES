//thread class
class Q_1 extends Thread{
    public void run(){
        System.out.println("The thread is running");
    }

    public static void main(String args[]){
        Q_1 t1 = new Q_1();
        t1.start();
    }
}