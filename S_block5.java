class Customer{
    int amount = 100000;

    synchronized void withdraw(int amount){
        System.out.println("GOING TO WITHDRAW...");

        if(this.amount<amount){
            System.out.println("LESS BALANCE: WAITING FOR DEPOSIT");
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        this.amount-=amount;
        System.out.println("AMOUNT CREDITED");
    }

    synchronized void deposit(int amount){
        System.out.println("GOING TO DEPOSIT...");
        this.amount+=amount;
        System.out.println("AMOUNT DEPOSITED");
        notify();
    }
}

class S_block5{
    public static void main(String args[]){
        Customer c = new Customer();
        new Thread(){
            public void run(){
                c.withdraw(200000);
            }
        }.start();
        new Thread(){
            public void run(){
                c.deposit(1000000);
            }
        }.start();
    }
}