//checked exception
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Javatrycatch5{
    public static void main(String args[]){
        PrintWriter pw;
        try{
            pw = new PrintWriter("jtb.txt");
            pw.println("saved");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }

        System.out.println("saved file");
    }
}