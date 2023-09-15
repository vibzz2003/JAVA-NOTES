import java.util.*;
public class Exp2_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        System.out.println("Enter the third number");
        c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("the greatest number is :" + " " + a);
        }else if(a<b && b>c){
             System.out.println("the greatest number is :" + " " + b);
        }else if(c>b && a<c){
             System.out.println("the greatest number is :" + " " + c);
        }

    }
}