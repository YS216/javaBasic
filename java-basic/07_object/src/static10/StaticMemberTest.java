package static10;

public class StaticMemberTest {

	public static void main(String[] args) {
		System.out.println("정적 변수(객체생성 안함) :" + StaticMember.sName);
		StaticMember.sMe3();
		
		StaticMember sm1 = new StaticMember();
		
		System.out.println("인스턴스 변수 : " + sm1.num);
		System.out.println("정적 변수 : " + sm1.sNum);
		
		sm1.Me1();
		sm1.sMe3();
//		Scanner sc = new Scanner(System.in);

	}

}
