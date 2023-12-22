package com.addinedu.model.vo;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		// 복습 1.
		Book b1 = new Book();
		b1.setTitle("혼자공부하는자바");
		b1.setAuthor("신용권");
		b1.setPrice(32000);
		b1.setPublisher("한빛미디어");
		
		Book b2 = new Book("마이바티스 프로그레밍","이동국",25000,"에이콘");
		
		Book b3 = new Book();
		// 사용자로부터 입력받아 필드에 값 저장하기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("도서명 입력 : ");
		b3.setTitle(scan.nextLine());
		System.out.println("저자 입력 : ");
		b3.setAuthor(scan.nextLine());
		System.out.println("가격 입력 : ");
		b3.setPrice(scan.nextInt());
		System.out.println("출판사 입력 : ");
		b3.setPublisher(scan.nextLine());
//		scan.next() 	// 단어단위로 문자열 받음
//		scan.nextLine() // 줄단위로 문자열 받음
//		scan.nextInt()  // int 형
		
		System.out.println("도서명 입력 : ");
		String title = scan.nextLine();
		System.out.println("저자 입력 : ");
		String author = scan.nextLine();
		System.out.println("가격 입력 : ");
		int price = scan.nextInt();
		System.out.println("출판사 입력 : ");
		String publisher = scan.next();
		
		Book b4 = new Book(title, author, price, publisher);
		
		Book book1 = null;
		Book book2 = null;
		Book book3 = null;
		for(int i=1;i<=3;i++) {
			System.out.println("도서명 입력 : ");
			String title2 = scan.nextLine();
			System.out.println("저자 입력 : ");
			String author2 = scan.nextLine();
			System.out.println("가격 입력 : ");
			int price2 = scan.nextInt();
			System.out.println("출판사 입력 : ");
			String publisher2 = scan.next();
			
			// 매번 검사
			if(i==1) {
				book1 = new Book(title2, author2, price2, publisher2);
			} else if (i==2) {
				book2 = new Book(title2, author2, price2, publisher2);
			} else {
				book3 = new Book(title2, author2, price2, publisher2);
			}
			
			System.out.println(book1.information());
			System.out.println(book2.information());
			System.out.println(book3.information());
			
			// 도서 제목으로 검색
			System.out.println("검색할 책 제목 : ");
			String search = scan.nextLine();
			
			if (book1.getTitle().equals(search)) {
				System.out.println(book1.information());
			} else if(book2.getTitle().equals(search)) {
				System.out.println(book2.information());
			} else {
				System.out.println(book3.information());
			}
			
		}
		

	}

}
