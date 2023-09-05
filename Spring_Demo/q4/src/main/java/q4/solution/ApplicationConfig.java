package q4.solution;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("q4.solution.BankAccount")
public class ApplicationConfig {
	
	@Bean
	public BankAccountRepository bankAccountRepository() {
		return new BankAccountRepositoryImpl();
	}
	
	@Bean
	public BankAccountService bankAccountService() {
		return new BankAccountServiceImpl();
	}
	
	@Bean
	public BankAccountController bankAccountController() {
		return new BankAccountController();
	}
	
}
