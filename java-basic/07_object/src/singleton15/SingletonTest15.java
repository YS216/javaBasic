package singleton15;

// 싱글톤 : 전체 프로그렘에서 단 하나의 객체만 만들도록 보장하는 기법
class Singleton {
	// 인스턴스 필드
	private Singleton singleton1;
	// = new Singleton();
	
	// 정적 필드
	private static Singleton singleton2;
	
//	// 생성자에 private를 붙여 객체를 생성할 수 없게 만든다.
//	private Singleton() {
//	}
	
	// 인스턴스 메소드 : 현재 메소드가 호출되었다는 것은 객체가 이미 생성되었다는 의미
	Singleton getInstance() {
		return singleton1;
	}
	
	static Singleton getInstance2() {
		return singleton2;
	}
	
	
}


public class SingletonTest15 {

	public static void main(String[] args) {
		// Singleton s1 = new Singleton(); // 불가
		/*
		 * Singleton sing1 = Singleton.getInstance(); Singleton sing2 =
		 * Singleton.getInstance();
		 */

	}

}
