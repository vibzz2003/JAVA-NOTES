//2 threads one even one odd
import java.util.*;
class even extends Thread{
    public void run(int n){
        for(int i=0; i<=n ; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
class odd extends Thread{
    public void run(int n){
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
class Q_3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        even t1 = new even();
        odd t2 = new odd();

        t1.start();
        t2.start();
    }
}