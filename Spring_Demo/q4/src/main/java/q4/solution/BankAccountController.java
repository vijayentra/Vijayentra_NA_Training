package q4.solution;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BankAccountController {
	
	@Inject
	private BankAccountService service;
	
	public BankAccountService getService() {
		return service;
	}

		public void setService(BankAccountService service) {
		this.service = service;
	}

	public void setUp() {
		service.setUp();
	}

	public double withdraw(long accountId, double balance) {
		return service.withdraw(accountId, balance);
	}
	
	public double deposit(long accountId, double balance) {
		return service.deposit(accountId, balance);
	}
	
	public double getBalance(long accountId) {
		return service.getBalance(accountId);
	}
	
	public boolean fundTransfer(long from,long to, double amount) {
		return service.fundTransfer(from,to,amount);
	}
	
} 