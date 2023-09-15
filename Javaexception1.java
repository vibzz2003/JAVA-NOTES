public class Javaexception1{
    public static void main(String args[]){
        try{
            int data = 100/0;
        }
        catch(ArithemticException e){
            System.out.println(e);
        }
        System.out.println("the rest of the code....");
    }
}