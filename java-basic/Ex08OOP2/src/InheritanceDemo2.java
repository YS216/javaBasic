
class TheParent2 {
	String pv;
	void pm() {
		System.out.println("TheParent.pm()");
	}
}

class TheChild2  extends TheParent2 { // extends : 상속 표현 --> TheParent의 모든 멤버가 TheChild에 포함
	String cv;
	
	void cm() {
		System.out.println("TheChhild.com()");
	}
}

public class InheritanceDemo2 {
	
	public static void main(String[] args) {
		
		// 상속 관계의 클래스 인 경우 참조 타입과 인스턴서 타입이 다를 수 있다.
		// 부모 참조 -> 자식 인스턴스는 가능 / 단, 자식 참조 -> 부모 인스턴스 불가능
		// TheParent p = new TheParent();   // 참조 타입 == 인스턴스 타입
		// TheChild c = new TheChild();     // 참조 타입 == 인스턴스 타입
		// TheParent p2 = new TheChild();   // 참조 타입 != 인스턴스 타입 ( 허용 )
		// TheChild c2 = new TheParent();   // 참조 타입 != 인스턴스 타입 ( 비허용 ) 

		
		TheParent2 p = new TheChild2(); // 부모 타입 참조 -> 자십 타입 인스턴스 접근 가능
		
		// TheChild2 c = new TheParent2(); // 자식 타입 참조 -> 부모 타입 인스턴스 접은 불가능
		// TheChild2 c = (TheChild2)new TheParent2(); // 자식 타입 참조 -> 부모 타입 인스턴스 접근 불가능
		
		TheChild2 c2 = (TheChild2)p;
		
		if (p instanceof TheChild2) { // 안전한 형변환 : p를 THeChild2 타입으로 형변환 할 수 있으면 true 반환
			System.out.println("형변환 가능");
			TheChild2 c3 = (TheChild2)p;
		}
		
		System.out.println("End of Program !!!");
	}

}

// 오버라이딩은 전달인자 같아야함. 상속 관계에서만 일어날 수 있음.
// 오버로딩은 전달인자 달라야 하고, 클래스가 같을 떄 사용 가능.