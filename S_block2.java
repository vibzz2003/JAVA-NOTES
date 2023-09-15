class Table{
    public void printTable(int n){
      synchronized(this){
        for(int i=1;i<=5;i++){
            System.out.println(i*n);
            try{
                Thread.sleep(800);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
      }
    }
}
class Mythread1 extends Thread{
    Table t;
    Mythread1(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(8);
    }
}
class Mythread2 extends Thread{
    Table t;
    Mythread2(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(16);
    }
}

class S_block2{
    public static void main(String args[]){
       Table obj = new Table();
        Mythread1 t1 = new Mythread1(obj);
        Mythread2 t2 = new Mythread2(obj);

        t1.start();
        t2.start();
    }
}