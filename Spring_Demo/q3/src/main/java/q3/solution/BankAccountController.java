package q3.solution;
public class BankAccountController {
	
	private BankAccountService service;
	
	public BankAccountService getService() {
		return service;
	}

	public void setService(BankAccountService service) {
		this.service = service;
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