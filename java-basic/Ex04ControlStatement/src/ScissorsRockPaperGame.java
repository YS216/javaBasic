
public class ScissorsRockPaperGame {

	public static void main(String[] args) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		// 난수 발생 방법
		double rv = (Math.random() * 3) + 1; // 0 ~ 1 범위의 double 타입 난수 반환
		int ran = (int)rv; 
		
		// System.out.println(rv);
		
		
		// 가위바위보 게임
		// 1. 컴퓨터 선택 ( 난수, 0:가위 or 1:바위 or 2:보 )
//		int com = (double)rv;
		
		
		// 2. 사용자 선택 ( 입력, 0:가위 or 1:바위 or 2:보 )
		
		System.out.println("********************");
		System.out.println("  1. 가위");
		System.out.println("  2. 바위");
		System.out.println("  3. 보");
		System.out.println("********************");
		System.out.print("가위, 바위, 보 중 하나를 입력하세요.");
		
		int player = scanner.nextInt();
		
		// 3. 컴퓨터와 사용자의 선택 비교해서 승/무/패 결정
		
//		if ( player == 1 ) {
//			if ( ran == 1 ) {
//				result = "Draw";
//			} else if (ran == 2 ) {
//				result = ""
//			}
//		}
		
		/*switch (selection) {
		case "1" :
			if (ran.equals("1")) {
				
			}
			
		} */
		
		// 4. 결과 출력 (사용자선택, 컴퓨터선택, 결과 )
		// 5. 사용자가 원할 때 까지 반복 ( 메뉴 )

	}

}
