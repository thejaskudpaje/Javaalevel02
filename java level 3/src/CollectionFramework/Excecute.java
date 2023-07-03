package CollectionFramework;

import java.util.Scanner;

class child_01 implements Parent{
	static int pin=12345;
	double credit;
	public void setBalance(double balance) {
		this.credit=balance;
	}

	public void test() {
		System.out.println("***WELCOME TO CREDIT CARD***");
		System.out.println("Balance is  "+credit);
	}
}

class child_02 implements Parent{
	static int pin=54321;
    double balance;
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public void test() {
		System.out.println("***WELCOME TO DEBIT CARD***");
		System.out.println("Balance is  "+balance);
	}
}

class Demo{
	public static void demo(Parent a) {
		Scanner s=new Scanner(System.in);
		//child_02 debit=new child_02(2500d);
		System.out.println("Press 9 to deposit amount\nPress 0 to continue");
int n=s.nextInt();
if(n==9) {
	System.out.println("Enter the amount");
	a.setBalance(s.nextDouble());
}

		a.test();
	}
}

class Excecute{
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		child_01 credit=new child_01();
		
		child_02 debit=new child_02();
		System.out.println("***Enter the card type***\n1--> credit\n2--> debit");
	
		int st=s.nextInt();
		if(st==1) {
			
			Demo.demo(credit);
		}
		else if(st==2) {
			Demo.demo(debit);
		}
		else
			System.out.println("Invalid entry");
	
	}
}