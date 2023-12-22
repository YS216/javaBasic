
public class BaseballGame {

	static java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	public static void main(String[] args) {
		
		main_loop: while (true) {
			String selection = selectTask();
			
			System.out.println();
			switch (selection) {
			case "1" :
			// 1. 컴퓨터의 숫자 선택 : (0~9, Random, 3개) --> 배열에 저장 (함수 만들고 호출) int[] comNumbers = selectNumbers();
				int[] comNums = comNumbers();
				System.out.printf("%d %d %d\n", comNums[0], comNums[1], comNums[2]);
				
				int round = 0;
				for (; round < 10; round++) {
				// 2. 사용자 숫자 선택 (0~9, 입력, 3개) --> 배열에 저장
					
					int[] userNums = inputUserNums();
					// System.out.printf("%d %d %d\n", userNums[0], userNums[1], userNums[2]);
					
				// 3. 컴퓨터 숫자와 사용자 선택 비교 후 결과 판정 ( S, B, O ) --> 3s가 나오면 Win, 아니면 2부터 다시, 10회 반복되면 지는걸로
					int[] sbo = compareNumbers(comNums, userNums); // {s_count, b_count, o_count}
					if (sbo[0] == 3) {
						System.out.println("축하합니다. 게임에서 승리했습니다.");
						break;
					} else {
						System.out.printf("ROUND %2d : [STRIKE:%d][BALL:%d][OUT:%d]\n", round + 1, sbo[0], sbo[1], sbo[2]);
					}
//					System.out.printf("s:%d b:%d o:%d\n", sbo[0], sbo[1], sbo[2]);
				}
				if (round == 10 ) {
					System.out.println("아쉽지만 게임에서 졌습니다.");
				}
			// 사용자가 원할 떄 까지 반복
				break;
				
			case "2" : break;
			case "3" : 
				System.out.println("프로그렘을 종료합니다.");
				break main_loop;
			default :
				System.out.println("지원하지 않는 작업입니다.");
				break;
			}		
			System.out.println();
		}
	}

	
	private static int[] compareNumbers(int[] comNums, int[] userNums) {
		int[] result = new int[3]; // 사용자 번호
		
		for (int ui = 0; ui < userNums.length; ui++) {
			
			int tempResult = 2; // 사용자 번호 1개에 대한 s:1, b:2, o:3 저장 변수
			for (int ci = 0; ci < comNums.length; ci++) {
				
				if (userNums[ui] == comNums[ci]) {
					if (ui == ci) {
						tempResult = 0;
						// strike	
					} else {
						tempResult = 1;
						// ball
					}
					break;
				}
			}
			result[tempResult] = result[tempResult] + 1;
			}
		return result;
	}

	public static String selectTask() {
		System.out.println("********************");
		System.out.println("  1. 숫자 야구 게임 시작");
		System.out.println("  2. 전적 보기");
		System.out.println("  3. 종료");
		System.out.println("********************");		
		System.out.printf("작업을 선택하세요 : ");
		String selection = scanner.nextLine();
		
		return selection;
	}

	public static int[] comNumbers() {
		int[] numbers = new int[3];
		for ( int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 10); // 0~9
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
		return numbers;
	}
	
	private static int[] inputUserNums() {
		System.out.print("숫자를 입력하세요 ( 숫자 1 숫자2 숫자3 ) : ");
		String line = scanner.nextLine();
		String[] sNums = line.split(" "); // 지정된 문자열(여기서는 공백)을 사용해서 문자열 분해하고 배열로 반환 : "1 2 3" --> { "1", "2", "3" }
		// System.out.printf("%s %s %s\n", sNums[0], sNums[1], sNums[2]);
		int[] userNums = new int[3];
		for (int i = 0; i < userNums.length; i++) {
			userNums[i] = Integer.parseInt(sNums[i]); // INteger.parseInt("10"); : "10" -> 10
		}
		return userNums;
	}
	
}
