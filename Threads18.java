//multi threading
class simple1 extends Thread{
    public void run(){
        System.out.println("running in simple 1");
    }
}
class simple2 extends Thread{
    public void run(){
        System.out.println("running in simple 2");
    }
}

class Threads18{
    public static void main(String args[]){
        simple1 s1 = new simple1();
        simple2 s2 = new simple2();

        s1.start();
        s2.start();
    }
}