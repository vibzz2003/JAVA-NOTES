public class Threads6 extends Thread{
    public void run(){
        System.out.println("is running");
    }
    public static void main(String args[]){
        Threads6 t1 = new Threads6();
        t1.start();
        t1.start();
    }
}
//will give an illegalthreadstate exception as we can not start a thread twice