
public class DepositerThread extends Thread {
	
	private BankAccount acc;
	private double amt;
	
	public DepositerThread(BankAccount acc, double amt) {
		super();
		this.acc = acc;
		this.amt = amt;
	}

	@Override
	public void run() {
		acc.deposit(amt);
	}
}
