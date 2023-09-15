import java.util.Scanner;
class Account1{
    public static void main(String[] args){
        Account1 a1 = new Account1();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(choice<6){
            System.out.println("PLEASE ENTER YOUR CHOICE : 1. Insert Account  2. Deposit  3. Withdraw  4. Display creds  5. Check balance 6. Exit");
            choice = sc.nextInt();
        switch(choice){
        
        case 1:
        a1.insert(23456,"Amit",123456);
        break;
        case 2:
        a1.deposit(500);
        break;
        case 3:
        a1.withdraw(500);
        break;
        case 4:
        a1.display();
        break;
        case 5:
        a1.checkBalance();
        break;
     }
    }
     System.out.println("Thank You, you exited the portal successfully.");
    }
    int accountnumber;
    String name;
    float money;

    void insert(int accountnumber,String name,float money ){
        System.out.println("Account added successfully, with Rupees 123456.");
    }

    void deposit(float m){
        money = money + m;
        System.out.println("The deposited amount is :"+ m);
    }

    void withdraw(float m){
        if(m>money){
            System.out.println("Sorry insufficient balance");
        }
        else{
            money=money - m;
            System.out.println("The amount withdrawn is:" + m);
        }
    }

    void display(){
        System.out.println(accountnumber+ " " + name + " " + money);
    }

    void checkBalance(){
        System.out.println("The balance left is :" + money);
    }

}