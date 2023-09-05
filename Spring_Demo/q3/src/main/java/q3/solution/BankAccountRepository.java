package q3.solution;
public interface BankAccountRepository {
		
	public double getBalance(long accountId);
	public void updateBalance(long accountId,double newBalance);
	
}