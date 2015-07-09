package bankAccount;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	
	BankAccount Ba = new BankAccount();

	@Test
	public void testGetBalance() {
		//Ba.withdrawCash(5000);
		assertNotEquals(0,Ba.getBalance());
	}
	
	@Test
	public void testWidthdraw() {
		
		assertEquals(5000,Ba.getBalance());
	}

}
