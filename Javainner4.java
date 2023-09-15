//A class i.e., created inside a method, is called local inner class in java.
//Local Inner Classes are the inner classes that are defined inside a block.
//Generally, this block is a method body.
//Sometimes this block can be a for loop, or an if clause
//They belong to the block they are defined within,
// due to which local inner classes cannot have any access modifiers associated with them. 
//they can be marked as final or abstract
public class Javainner4{
    private int data = 40;
    void display(){
        class Local{
            void msg(){
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }
    public static void main(String args[]){
      localInner1 obj = new localInner1();
      obj.display();  
    }
}