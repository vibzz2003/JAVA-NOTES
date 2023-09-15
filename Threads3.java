public class Threads3 implements Runnable{
    public void run(){
        System.out.println("is runnning");
    }

    public static void main(String args[]){
        Runnable t = new Threads3();
        Thread t1 = new Thread(t,"vibhor");
        t1.start();

        String str = t1.getName();
        System.out.println(str);
    }
}