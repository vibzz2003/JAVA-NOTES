import java.lang.Thread;
import java.io.*;
public class Threads5{
    public static void main(String args[]){
        try{
            for(int i=0;i<6;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
//main thread put to sleep here
//no negative sleep time - will create illegal argument exception and the session will be timed out