package static_intsance;

class Stin {
	
	// 인스턴스 멤버 : 반드시 객체가 생성되어야만 사용가능
	// 				인스턴스 멤버와 정적멤버 모두 사용 가능
	int inNum = 10;
	int plus(int x) {
		return inNum + x;
	}
	
	// 정적 멤버 : 클래스가 올라올 때 클래스에 저장공간 마련
	// 인스턴스 멤버 사용 불가 : 이유는 객체가 만들어졋다는 보장이 없기 때문
	static int sNum = 30;
	static int plus() {
		return sNum+10;
	}
}

public class Satic_instanceTest {

	public static void main(String[] args) {
		System.out.println(Stin.sNum);
		System.out.println(Stin.plus());

	}

}
