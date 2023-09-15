//we are handling using parent class exception
public class Javatrycatch2{
    public static void main(String args[]){
        try{
            int data = 50/0;
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("the rest of the code is still running");
    }
}