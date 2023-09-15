//custom printing in exception handling
public class Javatrycatch3{
    public static void main(String args[]){
        try{
            int data = 50/0;
        }
        catch(Exception e){
            System.out.println("this cannot be divided by 0");
        }
    }
}