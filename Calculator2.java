import java.util.*;
public class Calculator2{
    public static void main(String[] args){
        Calculator2 cal= new Calculator2();
        try (Scanner sc = new Scanner(System.in)) {
            int a;
            int b;
            System.out.println("Enter number a:");
            a=sc.nextInt();
            System.out.println("Enter number b:");
            b=sc.nextInt();
            
            int choice;
            System.out.println("Enter your choice:");
            System.out.println(" 1. Addition " + " 2. Substraction " + " 3. Multiplication " + " 4. Division ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    cal.add(a,b);
                break;
                
                case 2:
                    cal.sub(a,b);
                break;
                
                case 3:
                    cal.mul(a,b);
                break;
                
                case 4:
                    cal.div(a,b);
                break;
                
                default:
                 System.out.println("Please enter a valid operation");
                break;
            }
        }
        
        
    }
    int add(int a, int b){
        System.out.println("The sum of the given numbers is " + (a+b));
        return(a+b);
    }
    
    int sub(int a, int b){
        System.out.println("The diff. of the given numbers is " + (a-b));
        return(a-b);
    }
    
    int mul(int a, int b){
        System.out.println("The product of the given numbers is " + (a*b));
        return(a*b);
    }
    
    int div(int a, int b){
        float q;
        q=(float)a/(float)b;
        System.out.println("The sum of the given numbers is " + (q));
        return(a/b);
    }
}
