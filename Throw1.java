import java.util.Scanner;
public class Throw1{
    public static void validate(int age){
        if(age < 18){
            throw new ArithmeticException("not eligiblw to vote");
        }
        else{
            System.out.println("eligible to vote");
        }
    }
    public static void main(String args[]){
        int age;
        Scanner sc = new Scanner();
        System.out.println("enter ur age");
        age = sc.nextInt(System.in);
        validate(age);
    }
}