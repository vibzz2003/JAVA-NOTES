//Local variables can't be private, public, or protected.
//Local inner class cannot be invoked from outside the method
//Local inner class cannot access non-final local variable till JDK 1.7. Since JDK 1.8, it is possible to access the non-final local variable in the local inner class.

class Javainner6{
    private int data = 30;
    void display(){
        int value = 50; // local variable must be final till jdk 1.7
        class Local{
            void run(){
                System.out.println(value);
            }
        }
        Local l = new Local();
        l.run();
    }
    public static void main(String args[]){
        Javainner6 j = new Javainner6();
        j.display();
    }
}