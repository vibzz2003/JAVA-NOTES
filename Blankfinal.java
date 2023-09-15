class Parent{
    final int a;
    Parent(int x){
        a = x;
    }
    Parent(){
        a = 25;
    }
    void display(){
        System.out.println(a);
    }
}
class Blankfinal{
    public static void main(String args[]){
        Parent obj = new Parent();
        obj.display();
    }
}