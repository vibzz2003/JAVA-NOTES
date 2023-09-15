//solution to diamond problem
class Parent{
     void run(){
        System.out.println("this is the parent class");
    }
}
class Child1 extends Parent{
    public void run(){
        System.out.println("invoking child 1");
        super.run();
    }
}
class Child2 extends Parent{
    public void run(){
        System.out.println("invoking child 2");
    }
}
class Grandchild{
    Child1 c1 = new Child1();
    Child2 c2 = new Child2();

    public void run(){
        c1.run();
        c2.run();
    }
}
 class Composition{
    public static void main(String args[]){
        Grandchild g1 = new Grandchild();
        g1.run();
    }
 }