public class Calculator{
 public static void main(String[] args){
  Calculator cal = new Calculator();
  int a=5,b=4;

  cal.add(a,b);
  cal.sub(a,b);
  cal.div(a,b);
  cal.mul(a,b);
}

int add(int a,int b){
 System.out.println("the sum is :"+(a+b));
 return(a+b);
}

int sub(int a,int b){
 System.out.println("the sub is :"+(a-b));
 return(a-b);
}

int div(int a,int b){
 float q;
 q=(float)a/(float)b;
 System.out.println("the div is :"+(q));
 return(q);
}

int mul(int a,int b){
 System.out.println("the product is :"+(a*b));
 return(a*b);
}
}