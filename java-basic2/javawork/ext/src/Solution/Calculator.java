package Solution;

public class Calculator {
	public static void main(String[] args) {
		
		// 명령행 입력 객체 만들기
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		// 1. 숫자 입력
		System.out.print("첫번째 숫자 : ");
		int operand1 = scanner.nextInt();

		// 2. 연산자 입력
		System.out.print("연산자 : ");
		String op = scanner.next(); // scanner,nextLine();, scanner.next() : 명령형에서 문자열 입력 수행
		
		// 3. 숫자 입력
		System.out.print("두번째 숫자 : ");
		int operand2 = scanner.nextInt();

		// 4. 연산 ( 선택문 )
		double result = 0;
		boolean valid = true;
//		if (op == "+") { // 자바는 문자열의 내용을 비교할 때 equals 메서드 사용해야한다.
		if (op.equals("+")) {
			result = operand1 + operand2;
		} else if (op.equals("-")) {
			result = operand1 - operand2;
		} else if (op.equals("*")) {
			result = operand1 * operand2;
		} else if (op.equals("/")) {
			result = (double)operand1 / operand2; // 부동소수점 / 정수 -> 결과는 부동소수점
			// result = operand1 / operand2; // 정수 / 정수 -> 결과도 정수 (소수점 이하 데이터 손실)
		} else if (op.equals("%")) {
			result = operand1 % operand2;
		} else {
			// do nothing
			System.out.println("지원하지 않는 연산자입니다.");
			valid = false;
		}
		// 5. 출력
		if (valid) {
			System.out.printf("%d %s %d = %f\n", operand1, op, operand2, result);
		}
		// 같은 자료형 연산 -> 결과도 같은 자료형 ( int op int -> int )
		// 다른 자료형 연산 -> 볌위가 넓은 쪽이 결과 자료혈이 된다.
		

	}

}
