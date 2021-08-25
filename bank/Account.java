package HW.bank;

public class Account {
	
	int total;
	static int number;
	private int clientID;
	private int accountNumber;
	
	Account (Client x) {
		clientID  = x.getClientID();
		total = 0;
		accountNumber = number++;
		x.addAccount(this);
	}
	
	public void changeTotal(int operSum) {
		total += operSum;		
	}
	@Override
	public int hashCode() {
		return accountNumber;
	}
	public void showAccount() {
		System.out.println("Account# " + accountNumber + ": " + total);
	}
	
	
	

}
