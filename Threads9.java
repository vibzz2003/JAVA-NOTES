class Threads9 extends Threads{
    public void run(){
    for(int i=0;i<3;i++){
        try{
            Thread.sleep(300);
        }
        catch(Exception e){
            System.out.println("the exception is handled");
        }
        System.out.println(i);
    }
    }

    public static void main(String args[]){
        Threads9 t1 = new Threads9();
        Threads9 t2 = new Threads9();
        Threads9 t3 = new Threads9();

        t1.start();
        try{
            System.out.println("Current thread is : " + Thread.currentThread().getName());
            t1.join();
        }
        catch(Exception e){
            System.out.println("The exception is handled" + e);
        }

        t2.start();
        t3.start();
    }
}