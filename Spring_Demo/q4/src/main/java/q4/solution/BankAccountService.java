package q4.solution;
public interface BankAccountService {
	
	public void setUp();
	public double withdraw(long accountId, double balance);
	public double deposit(long accountId, double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount,long toAccount,double amount);
}