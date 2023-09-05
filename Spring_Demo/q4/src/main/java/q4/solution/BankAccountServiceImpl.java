package q4.solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.inject.Inject;

@Service
 public class BankAccountServiceImpl implements BankAccountService {
	
	@Inject
	private BankAccountRepository bankAccountRep;
	
	public BankAccountRepository getBankAccountRep() {
		return bankAccountRep;
	}

	public void setBankAccountRep(BankAccountRepository bankAccountRep) {
		this.bankAccountRep = bankAccountRep;
	}

	@Override
	public double withdraw(long accountId, double balance) {
		// TODO Auto-generated method stub
		if(balance<=bankAccountRep.getBalance(accountId)) {
			bankAccountRep.updateBalance(accountId, (bankAccountRep.getBalance(accountId)-balance));
			return bankAccountRep.getBalance(accountId);
		}
		return -1;
	}

	@Override
	public double deposit(long accountId, double balance) {
		bankAccountRep.updateBalance(accountId, (balance+ bankAccountRep.getBalance(accountId)));
		return bankAccountRep.getBalance(accountId);
	}

	@Override
	public double getBalance(long accountId) {
		return bankAccountRep.getBalance(accountId);
	}


	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		if(bankAccountRep.getBalance(fromAccount)>=amount) {
			bankAccountRep.updateBalance(fromAccount, ((bankAccountRep.getBalance(fromAccount))-amount));
			bankAccountRep.updateBalance(toAccount, ((bankAccountRep.getBalance(toAccount))+amount));
			return true;
		} 
		return false;
	}
	
	@Override
	public void setUp() {
		bankAccountRep.setUp();
	}
	
}