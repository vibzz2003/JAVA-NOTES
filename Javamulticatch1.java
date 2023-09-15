public class Javamulticatch1{
    public static void main(String args[]){
        try{
            int arr[] = new int[5];
            arr[5] = 50/0;
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bounds exception");
        }
        catch(Exception e){
            System.out.println("exception occurs");
        }
        System.out.println("the rest of the code");
    }
}