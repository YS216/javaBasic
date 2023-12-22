package args13;

public class MultiArgsTest {

	public static void main(String[] args) {
		
		String str = concatenate("a", "b", "c");
		System.out.println(str);
		
		String strArr[] = {"홍길동", "아무개", "이순신"};
		System.out.println(concatenate(strArr));
		System.out.println(con2("-","홍길동", "아무개", "이순신"));
		System.out.println(con2("/",new String[] {"1","2","3"}));
		System.out.println(con2(" ",strArr));
		
		// 합계 숫자가 몇개가 들어올 지 모름
		// 메소드 호출하여 합계 출력
	}
	
//	String concatenate(String i, String a, String b, String c) {
//		String result = "";
//		result = 1 + a + b + c;
//		return result;
//	}
	
	static String concatenate(String... a) {
		String result = "";
		for(String str : a) {
			result += str + ",";
		}
		return result;
	}
	static String con2(String delim, String...b) {
		String result = "";
		for(String str : b){
			result += str + delim;
		}
		return result;
	}
	
	static String con3(String...c) {
		String result = "";
		for(String str : c) {
			result += str + ",";
		}
		return result;
	}

}
