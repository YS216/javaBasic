package userDefineException02;

public class BankTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.deposit(1000);
		System.out.println("현재 잔액 : " + bank.getBalance());
		
		try {
			bank.withdraw(10000);
			System.out.println("현재 잔액 : " + bank.getBalance());
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
	}
}
