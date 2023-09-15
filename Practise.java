class Practise1{
    Practise1(){
        System.out.println("Practise makes man perfect");
    }
}
class Practise extends Practise1{
    Practise(){
        super();
        System.out.println("Practise child invoked");
    }
    {
        System.out.println("instance initialiser block invoked");
    }

    public static void main(String args[]){
        Practise p1 = new Practise();
        Practise p2 = new Practise();
    }
}