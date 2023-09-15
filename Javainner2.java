//Java anonymous inner class is an inner class without a name and for which only a single object is created.
//Java Anonymous inner class can be created in two ways:
//Class (may be abstract or concrete).
//Interface

abstract class P{
    abstract void eat();
}

class Javainner2{
    public static void main(String args[]){
        P p = new P(){
            void eat(){
                System.out.println("eating...");
            }
        };
        p.eat();
    }
}