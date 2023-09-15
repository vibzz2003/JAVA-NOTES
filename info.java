//Upcasting
//If the reference variable of Parent class refers to the object of Child class, it is known as upcasting. For example:

//class A{}  
//class B extends A{}  
//A a=new B();//upcasting  

//here it is overidden at run time//

class bike{
    void run(){
        System.out.println("bike is running");
    }
}
class info extends bike{
    void run(){
        System.out.println("bike is running safely");
    }
    public static void main(String args[]){
        bike b = new info();
        b.run();
    }
}

//we can achieve runtime polymorphism by methods not by data members//