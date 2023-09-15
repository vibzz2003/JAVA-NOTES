//A non-static class that is created inside a class but outside a method is called member inner class.
//also known as a regular inner class.
//can be declared with access modifiers like public, default, private, and protected.
class Javainner1{
    private int data = 30;
    class Inner{
        public void msg(){
            System.out.println("the data is :" + data);
        }
    }
    public static void main(String args[]){
        Javainner1 j = new Javainner1();
        Javainner1.Inner in = j.new Inner();
        in.msg();
    }
}