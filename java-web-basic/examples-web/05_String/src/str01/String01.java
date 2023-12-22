package str01;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		String name = "홍길동";
		String hobby = "공부하기";
		
		System.out.println(name);
		System.out.println(name == hobby);
		
		String str1 = "java";
		String str2 = "java";
		System.out.println(str1 == str2);
		
		String str3 = new String("java");
		String str4 = new String("java");
		System.out.println(str3 == str4);

	}

}
