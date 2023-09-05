package q4.solution;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BankAccountRepositoryImpl implements BankAccountRepository {
	
	private List<BankAccount> accounts; 
	
	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}
	
	@Override
	public void setUp() {
		List<BankAccount> list = new ArrayList<>();
		BankAccount b1 = new BankAccount(101,"vijay","current",10000);
		BankAccount b2 = new BankAccount(102,"ajay","current",15000);
		list.add(b2);
		list.add(b1);
		setAccounts(list);
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