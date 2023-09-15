public class Javafinally2{
    public static void main(String args[]){
        try{
            int arr[] = new int[5];
            arr[5] = 6;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("sasura ee exception chal gaya ka?");
        }
    }
}