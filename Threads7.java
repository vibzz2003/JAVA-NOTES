//what if we directly call the run method instead of the start method?
public class Threads7 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
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
        Threads7 t1 = new Threads7();
        Threads7 t2 = new Threads7();

        t1.run();
        t2.run();
    }
}
//first of all run does not call the entire stack, it calls only the current call stack
//also context switching does not happen between the two processes or threads