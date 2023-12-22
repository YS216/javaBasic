package com.kh.practice.list.library.model.vo;

public class Book {
	
	String title;
	String author;
	String category;
	int price;

	Book() {
		
	}
	
	Book(String title, String author, String category, int price){
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

}
