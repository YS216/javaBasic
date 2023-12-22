
public class PersonDemo {

	public static void main(String[] args) {
		
		int x; // 자료형 변수;
		int[] ar = new int[10]; // 자료형 변수 = new 자료형[갯수];

		// 클래서 사용
		
		// 1. 인스턴스 만들기
		Person person = new Person(); // 자료형 변수 = new 자료형();
		
		// 2. 멤버 사용
		person.no = 1;
		person.name = "young";
		person.phone = "010-1234-5678";
		person.email = "no2idin@naver.com";
		
		String info = person.info();
		System.out.println(info);
	}

}
