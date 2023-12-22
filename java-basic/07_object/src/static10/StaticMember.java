package static10;

public class StaticMember {
	// 인스턴스 필드
	int num = 1;
	String name = "인턴스";
	
	// 정적 필드
	static int sNum = 2;
	static String sName = "김정적";
	
	// 인스턴스 메소드
	void Me1() {
		System.out.println("인스턴스 메소드 Me1()");
	}
	String Me2() {
		System.out.println("인스턴스 메소드 Me2()");
		return "Me2";
	}
	
	// 정적 메소드
	static void sMe3() {
		System.out.println("정적 메소드 sMe3()");
	}
	static int sMe4() {
		System.out.println("정적 메소드 sMe4()");
		return 4;
	}
	

}
