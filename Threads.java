class Threads extends Thread{
    public void run(){
        System.out.println("is running");
    }
    public static void main(String args[]){
        Threads t1 = new Threads();
        t1.start();
    }
}