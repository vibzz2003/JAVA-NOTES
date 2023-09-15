class Threads4 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        Threads4 t1 = new Threads4();
        Threads4 t2 = new Threads4();

        t1.start();
        t2.start();
    } 
}
//two threads put to sleep here