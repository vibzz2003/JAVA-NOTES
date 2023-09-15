// method overriding concept //
class vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}
class Bike extends vehicle{
    void run(){
        System.out.println("vehicle is running safely");
    }

    public static void main(String args[]){
        //new instance of the child class//
        Bike obj  =  new Bike();
        obj.run();
    }
}