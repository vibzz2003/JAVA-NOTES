//Anonumous inner class using interface
interface Eatable{
    void run();
}

class Javainner3{
    public static void main(String args[]){
        Eatable e = new Eatable(){
            public void run(){
                System.out.println("Eating.....");
            }
        };
        e.run();
    }
}