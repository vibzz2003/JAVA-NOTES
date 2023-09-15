//An interface, i.e., declared within another interface or class, is known as a nested interface.
// The nested interface must be referred to by the outer interface or class
//It can't be accessed directly.
//The nested interface must be public if it is declared inside the interface, but it can have any access modifier if declared within the class.
//Nested interfaces are declared static
interface Showable{
    void ran();
    interface Message{
        void run();
    }
}
class Nestedinterface implements Showable.Message{
    public void run(){
        System.out.println("hello nested interface");
    }
    public static void main(String args[]){
        Showable.Message message = new Nestedinterface();
        message.run();
    }
}
//Yes, if we define a class inside the interface, the Java compiler creates a static nested class.