package q3.solution;

import java.util.List;

public class BankAccountRepositoryImpl implements BankAccountRepository {
	
	private List<BankAccount> accounts; 
	
	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	@Override
	public double getBalance(long accountId) {
		int count=0;
		for(BankAccount b : accounts) {
			if(b.getAccountId()==accountId) {
				count =1;
				return b.getAccountBalance();
			}
		}
		if(count==1) {
			System.out.println("Invalid id");
			return -1;
		}
		return -1;
	}

	@Override
	public void updateBalance(long accountId, double newBalance) {
		int count=0;
		for(BankAccount b : accounts) {
			if(b.getAccountId()==accountId) {
				count =1;
				b.setAccountBalance(newBalance);
				break;
			}
		}
		if(count==0) {
			System.out.println("Invalid details");
		}
		
	}
}