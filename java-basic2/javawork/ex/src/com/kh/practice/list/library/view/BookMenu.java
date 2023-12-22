package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;

public class BookMenu {
	
	// BookController 객체 생성
	BookController bookC = new BookController();
	
	// Scanner 객체
	Scanner scan = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			// insertBook () 실행
			System.out.println("2. 도서 전체 조회");
			// selectList ()
			System.out.println("3. 도서 검색 조회");
			// searchBook ()
			System.out.println("4. 도서 삭제");
			// deleteBook ()
			System.out.println("5. 도서 명 오름차순 정렬");
			// ascBook()
			System.out.println("9. 종료");
			// “프로그램을 종료합니다.” 출력 후 main()으로 리턴
			
			System.out.println("메뉴 번호 입력 :");
			String selection = scan.nextLine();
			
			System.out.println();
	//		// 메뉴 화면 반복 실행 처리
	//		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
			
			switch(selection) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "9":
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}

	}
	
	
	// 1. 새 도서 추가용 view 메소드
	public void insertBook() {
//		1. 도서명 입력받기 (String title)
//		2. 저자명 입력받기 (String author)
//		3. 장르 입력받기 (int category) --> 숫자로 입력받기 (1.인문 / 2.자연과학 / 3.의료 / 4.기타)
//		4. 가격 입력받기 (int price)
//		5. 매개변수 생성자를 이용하여 Book 객체 생성
//		(객체 생성 시 장르 번호 별로 조건식 이용해 장르번호가 아닌 장르 명으로 값 넘겨야 함)
//		6. bc(BookController)의 insertBook으로 위의 Book 객체 전달
	}
	
	
	// 2. 도서 전체용 view 메소드
	public void selectList() {
//		1. bc(BookController)의 selectList() 메소드를 호출 후
//		--> 결과 값을 임의의 리스트(ArrayList<Book> bookList)에 대입
//		2. 조건식 이용해서
//		2_1. bookList가 "비어있는 경우" --> "존재하는 도서가 없습니다." 라는 알람 문구 출력
//		2_2. bookList가 "비어있지 않은 경우" --> 반복문을 통해 bookList 안의 Book 객체들 출력
	}
	// 3. 도서 검색용 view 메소드
	public void searchBook() {
//		1. 검색할 도서명 키워드로 입력 받기 (String keyword)
//		2. bc(BookController)의 searchBook() 메소드로 위의 keyword 값 전달 후
//		--> 결과 값을 임의의 리스트(ArrayList<Book> searchList)에 대입
//		** 결과 값이 한 도서의 Book 객체가 아니라 리스트인 이유
//		보통 프로그램에서 검색 할 때 풀 네임을 쳐서 검색하지 않고 키워드로 검색
//		즉, 키워드를 포함한 결과가 하나가 아닌 여러 개일 수 있기 때문에 리스트로 받기
//		3. 조건식 이용해서
//		3_1. searchList가 "비어있는 경우" --> "검색 결과가 없습니다."라는 알람 문구 출력
//		3_2. searchList가 "비어있지 않은 경우" --> 반복문으로 searchList 안의 Book 객체들 출력
	}
	// 4. 도서 삭제용 view 메소드
	public void deleteBook() {
//		1. 삭제할 도서명 입력 받기 (String title)
//		2. 삭제할 저자명 입력 받기 (String author)
//		** 도서명과 저자명을 같이 입력 받는 이유
//		--> 같은 도서명이라고 해도 저자명이 다른 도서가 있을 수 있기 때문에
//		3. bc(BookConroller)의 deleteBook() 메소드로 위의 title, autor 값 전달 후
//		--> 결과 값을 임의의 Book(Book remove)에 대입
//		4. 조건식 이용해서
//		4_1. remove가 존재하는 경우 --> "성공적으로 삭제되었습니다."라는 문구 출력
//		4_2. remove가 존재하지 않은 경우 --> "삭제할 도서를 찾지 못했습니다."라는 문구 출력
	}
	
	// 5. 도서 명 오름차순 정렬용 view 메소드
	public void ascBook() {
//		bc(BookController)의 ascBook() 메소드 값에 따라
//		성공 시 “정렬에 성공하였습니다.”, 실패 시 “정렬에 실패하였습니다.” 출력
	}
	

}
