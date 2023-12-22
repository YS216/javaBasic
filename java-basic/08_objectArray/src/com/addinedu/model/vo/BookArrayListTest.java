package com.addinedu.model.vo;

import java.util.ArrayList;
import java.util.Scanner;

public class BookArrayListTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> a1 = new ArrayList<Book>();
		
		
		System.out.println("도서명 입력 : ");
		String title = scan.nextLine();
		System.out.println("저자 입력 : ");
		String author = scan.nextLine();
		System.out.println("가격 입력 : ");
		int price = scan.nextInt();
		System.out.println("출판사 입력 : ");
		String publisher = scan.next();
		
		a1.add(new Book(title, author, price, publisher));

	}

}
