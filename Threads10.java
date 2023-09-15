class Threads10 extends Threads{
    public void run(){
        System.out.println("running....");
    }

    public static void main(String args[]){
        Threads10 t1 = new Threads10();
        Threads10 t2 = new Threads10();
        System.out.println("current name of t1 :" + t1.getName());
        System.out.println("current name of t2 :" + t2.getName());
        t1.start();
        t2.start();
        t1.setName("Vibhor");
        t2.setName("Ranya");
        System.out.println("after changing the name :  the name is : " + t1.getName());
        System.out.println("after changing the name :  the name is : " + t2.getName());
    }
}