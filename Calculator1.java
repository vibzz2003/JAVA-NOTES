import java.util.*;
public class Calculator1{
 public static void main(String[] args){
  double a;
  double b;
  Calculator1 cal = new Calculator1();
  try (Scanner sc = new Scanner(System.in)) {
    System.out.println("enter the value of a");
    a = sc.nextDouble();
    System.out.println("enter the value of b");
    b = sc.nextDouble();
  }
  
  cal.add(a,b);
  cal.sub(a,b);
  cal.div(a,b);
  cal.mul(a,b);
}

double add(double a,double b){
 System.out.println("the sum is :"+(a+b));
 return(a+b);
}

double sub(double a,double b){
 System.out.println("the sub is :"+(a-b));
 return(a-b);
}

double div(double a,double b){
 float q;
 q=(float)a/(float)b;
 System.out.println("the div is :"+(q));
 return(a/b);
}

double mul(double a,double b){
 System.out.println("the product is :"+(a*b));
 return(a*b);
}
}

