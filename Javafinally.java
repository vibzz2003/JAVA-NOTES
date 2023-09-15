public class Javafinally{
    public static void main(String args[]){
        try{
            int a = 50/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("maa chudae exception handling");
        }
    }
}