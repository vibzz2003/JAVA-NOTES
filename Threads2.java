public class Threads2{
    public static void main(String args[]){
        Thread t = new Thread("my new thread");
        t.start();

        String str = t.getName();
        System.out.println(str);
    }
}