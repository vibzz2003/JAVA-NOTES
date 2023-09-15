public class Javainner8{
    static int data = 30;
    static class Inner{
        static void run(){
            System.out.println("data is " + data );
        }
    }
    public static void main(String args[]){
        Javainner8.Inner.run();
    }
}