package bankAccount;

public class BankAccount {
	
	int accNum;
	int bal = 5000;
	
	public void depositCash(int amt) {
		bal = bal + amt;
	}
	
	public void withdrawCash(int amt){
		bal = bal - amt;
	}
	
	public int getBalance() {
		return bal;
	}
}
