import java.util.*;
class Demo1 extends Thread{
	synchronized public void run(){
        System.out.println("Even numbers till 10 is: ");
		for(int i = 1; i<=10;i++){
			if(i%2 == 0)
				System.out.print(i + ", ");
		}
	}
	synchronized public void run(int m){
	    System.out.println("\n");
	    System.out.println("Odd numbers till 10 is: ");
		for(int j = 1; j<=m;j++){
			if(j%2 != 0)
				System.out.print(j + ", ");
		}
	}
}

public class EXP9_1{
	public static void main(String args[]){
		Scanner obj1 = new Scanner(System.in);
		Demo1 T1 = new Demo1();
		Demo1 T2 = new Demo1();
		Demo2 T3 = new Demo2();
		T1.run();
		T2.run(10);
		T3.run(10);
	}
}