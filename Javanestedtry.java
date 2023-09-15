public class Javanestedtry{
    public static void main(String args[]){
        try{
            try{
                System.out.println("going to divide by 0");
                int a = 50/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int arr[] = new int[5];
                arr[5] = 4;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

            System.out.println("statement of the main try block");
        }
        catch(Exception e){
            System.out.println("handled the outer catch block");
        }
        System.out.println("regular program line");
    }
}