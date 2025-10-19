
public class BankAccount {
	private int accNum;
	private String accHName;
	private double balance;
	
	public BankAccount(int accNum, String accHName, double balance) {
		
		this.accNum = accNum;
		this.accHName = accHName;
		this.balance = balance;
	}
public void deposit(double amt) {
	this.balance=this.balance+amt;
	System.out.println(amt+" is credited in "+ accHName + " account");
 }

public void withdraw(double amt) {
	this.balance=this.balance-amt;
	System.out.println(amt+" is debited in "+ accHName + " account");

   }
public void currentbalance() {   
	System.out.println(balance);
	
}
}
