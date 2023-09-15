//final keyword code with compile error issue//
class Misc3{
    final int speed = 60;
    void run(){
        speed = 100;
    }
public static void main(String args[]){
    Misc3 obj = new Misc3();
    obj.run();
}
}
//final method can be inherited but not  overridden and also final class cant be inherited//
//blank final variable is unintialised varibale and can only be initialsed in a constructor//


// static final variable can be initialised only in static block//
//class A{  
// static final int data;//static blank final variable  
//static{ data=50;}  
//public static void main(String args[]){  
// System.out.println(A.data);  
//}  
//}  