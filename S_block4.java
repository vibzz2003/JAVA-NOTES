//static synchronisation :
//If you make any static method as synchronized, the lock will be on the class not on object.
class Table{
    synchronized static void printTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(i*n);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Thread1 extends Thread{
    public void run(){
        Table.printTable(1);
    }
}
class Thread2 extends Thread{
    public void run(){
        Table.printTable(5);
    }
}
class Thread3 extends Thread{
    public void run(){
        Table.printTable(10);
    }
}
class Thread4 extends Thread{
    public void run(){
        Table.printTable(100);
    }
}
class S_block4{
    public static void main(String t[]){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}