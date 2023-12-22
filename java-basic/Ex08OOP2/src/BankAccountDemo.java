
class BankAccount {
	int accountNo;
	String owner;
	double balance;
	
	void deposit () {
		System.out.println("공통 예금");
	}
	void withdraw () {
		System.out.println("공통 인출");
	}
}

class GeneralAccount extends BankAccount {
	boolean salsryAccount;
	void deposit () {
		System.out.println("입출금계좌 예금");
	}
	void withdraw () {
		System.out.println("입출금계좌 인출");
	}
}
class SavingsAccount extends BankAccount { // 적금
	double interestRate;
	double depositAmount;
	void deposit () {
		System.out.println("적금계좌 예금");
	}
	void withdraw () {
		System.out.println("적금계좌 인출");
	}
}
class MinusAccount extends BankAccount {
	double interestRate;
	double limit;
	void deposit () {
		System.out.println("마이너스계좌 예금");
	}
	void withdraw () {
		System.out.println("마이너스계좌 인출");
	}
}

public class BankAccountDemo {

	public static void main(String[] args) {

		// 계좌 10개 ( minus 3개, 입출금 4개, 적금 3개 )
		// minus, savings, general 클래스의 부모 클래스인 BankAccount 클래스의 배열을 만들면
		// minus, savings, general 클래스의 인스턴스를 저장 할 수 있다.
		BankAccount[] accounts = new BankAccount[10];
		
		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0) {
				accounts[i] = new GeneralAccount();
			} else if (i % 3 == 1) {
				accounts[i] = new SavingsAccount();
			} else {
				accounts[i] = new MinusAccount();
			}
		}
		
		for (int i = 0; i < 10; i++) {
			accounts[i].deposit();
			accounts[i].withdraw();
			// 동일한 코드로 다른기능 : 다형성
			// 참조하는 객체/상황에 따라 다른 기능을 한다.
			// 1. 참조타입 != 인스턴스
			// 2. 재정의 메서드 호출기준 : 인스턴스
			
		}
	}
}


