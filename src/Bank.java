
public class Bank {

	public static void main(String[] args) throws InterruptedException {
		
		BankAccount acc1= new BankAccount(123,"Shubham's",106537.64);
		BankAccount acc2= new BankAccount(1100141124,"Virat's",207564.87);
		BankAccount acc3= new BankAccount(1100141123,"Sachin's",300654.54);
		
		DepositerThread dt1 = new DepositerThread(acc1,5000);
		DepositerThread dt2 = new DepositerThread(acc2,7000);
		WithdraweeThread wt1 = new WithdraweeThread(acc3,5000);
		
		System.out.print("Account acc1's Balance is  : "); acc1.currentbalance();
		System.out.print("Account acc2's Balance is  : "); acc2.currentbalance();
		System.out.print("Account acc3's Balance is  : "); acc3.currentbalance();
		System.out.println();
		
		dt1.start();
		dt2.start();
		wt1.start();
		
		Thread.sleep(1000);
		
		System.out.println();
		System.out.print("Account acc1's Balance is  : "); acc1.currentbalance();
		System.out.print("Account acc2's Balance is  : "); acc2.currentbalance();
		System.out.print("Account acc3's Balance is  : "); acc3.currentbalance();
		
	}

}
