package com.addinedu.model.vo;

import java.util.Scanner;

public class BookArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book[] books = new Book[3];
		
		for (int i=0; i<books.length; i++) {
			System.out.println(i + 1 + "번째 도서 정보 입력");
			System.out.println("도서명 입력 : ");
			String title = scan.nextLine();
			System.out.println("저자 입력 : ");
			String author = scan.nextLine();
			System.out.println("가격 입력 : ");
			int price = scan.nextInt();
			System.out.println("출판사 입력 : ");
			String publisher = scan.next();
			
			// 배열에 객체 입력
			books[i] = new Book(title, author, price, publisher);
			System.out.println(books[i].information());
			
		}

	}

}
