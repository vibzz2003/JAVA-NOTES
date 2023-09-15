class Inh{
    float a = 10000;
    class ch extends Inh{
        float b = 20000;
        public static void main(String[] args){
            ch c = new ch();
            System.out.println("a = " + c.a);
            System.out.println("b = " + c.b);
        }
    }
}