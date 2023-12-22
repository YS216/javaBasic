package objMethod04;

public class Arithmetic {
	// 5칙연산 메소드 만들기
	int add(int x, int y) {
		int re = x + y;
		return re;
	}
	
	String add2(int a, int b, int c, int d, int e) {
		int re1 = a + b;
		int re2 = a - c;
		int re3 = a * d;
		int re4 = a / e;
		int re5 = a % b;
		
		System.out.println(re1);
		System.out.println(re2);
		System.out.println(re3);
		System.out.println(re4);
		System.out.println(re5);
		
		return "결과값"; 
	}
	
}
