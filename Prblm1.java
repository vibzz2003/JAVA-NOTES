import java.util.*;
public class Prblm1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l;
        int b;
        System.out.println("ENTER THE LENGTH");
        l = sc.nextInt();
        System.out.println("ENTER THE BREADTH");
        b = sc.nextInt();

        int area;
        area = l*b;
        System.out.println("THE DESIRED AREA IS" + area);
        
    }
}