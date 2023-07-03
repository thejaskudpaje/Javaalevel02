

import java.util.Scanner;
 class InsufficientBalanceException extends RuntimeException {
	InsufficientBalanceException(String s){
		super(s);
	}

}

class IncorrectPinException extends RuntimeException{
	IncorrectPinException(String s1){
		super(s1);
	}
}

class Account
{
	long accno;
	double balance;
	int pin;
	
	public Account(long accno,double balance, int pin) {
		this.accno=accno;
		this.balance=balance;
		this.pin=pin;
	}
	
	public static void main(String[] args) {
		Account a=new Account(1455265662l,52000d,4433);
		try {
		a.withdrawMoney();
		}
		catch(IncorrectPinException c){
			System.out.println(c);
			}
		catch(InsufficientBalanceException b) {
			System.out.println(b);
			
		}
		finally {
			System.out.println("Thank you for using banking service");
		}
		a.welcome();
	}
	
	public void withdrawMoney() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the pin");
		int pin=s.nextInt();
		if(this.pin==pin) {
			System.out.println("Enter the amount");
			double amt=s.nextDouble();
			if(this.balance>=amt){
				balance=balance-amt;
				System.out.println("Amount withdraw successfull");
				System.out.println("updated account balance: "+balance);
			}
			else {
				throw new InsufficientBalanceException("Your account balance is less");
			}
		}
		else {
			throw new IncorrectPinException("You have entered wrong pin");
		}
	}
	
	public void welcome() {
		System.out.println("Remove your card");
	}
}
