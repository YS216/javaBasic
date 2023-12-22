
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;


class Book {
    private String title;
    private String author;
    private String category;
    private int price;

    public Book(String title, String author, String category, int price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    // Add getters and setters here

    @Override
    public String toString() {
        return "(" + title + "/" + author + "/" + category + "/" + price + ")";
    }

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}
}

class BookController {
    private List<Book> bookList;

    public BookController() {
        bookList = new ArrayList<>();
        // Initialize with some default books
        bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
        bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
        bookList.add(new Book("대화의 기술", "다니엘", "인문", 17500));
        bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
    }

    public void insertBook(Book bk) {
        bookList.add(bk);
    }

    public List<Book> selectList() {
        return bookList;
    }

    public List<Book> searchBook(String keyword) {
        List<Book> searchList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                searchList.add(book);
            }
        }
        return searchList;
    }

    public Book deleteBook(String title, String author) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                bookList.remove(book);
                return book;
            }
        }
        return null;
    }

    public int ascBook() {
        Collections.sort(bookList, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        return 1;
    }
}

class BookMenu {
    private Scanner sc;
    private BookController bc;

    public BookMenu() {
        sc = new Scanner(System.in);
        bc = new BookController();
    }

    public void mainMenu() {
        int choice;
        do {
            System.out.println("== Welcome KH Library ==");
            System.out.println("=====***** 메인 메뉴 *****=====");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 명 오름차순 정렬");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 입력 : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insertBook();
                    break;
                case 2:
                    selectList();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    ascBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            }
        } while (choice != 9);
    }

    public void insertBook() {
        System.out.println("===== 새 도서 추가 =====");
        System.out.print("도서 명 : ");
        String title = sc.next();
        System.out.print("저자 명 : ");
        String author = sc.next();
        System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
        String category = getCategory(sc.nextInt());
        System.out.print("가격 : ");
        int price = sc.nextInt();

        Book newBook = new Book(title, author, category, price);
        bc.insertBook(newBook);
    }

    public void selectList() {
        List<Book> bookList = bc.selectList();
        if (bookList.isEmpty()) {
            System.out.println("존재하는 도서가 없습니다.");
        } else {
            System.out.println("===== 도서 전체 조회 =====");
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }

    public void searchBook() {
        System.out.print("검색 키워드: ");
        String keyword = sc.next();
        List<Book> searchList = bc.searchBook(keyword);
        if (searchList.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            System.out.println("===== 도서 검색 =====");
            for (Book book : searchList) {
                System.out.println(book);
            }
        }
    }

    public void deleteBook() {
        System.out.print("삭제할 도서 명: ");
        String title = sc.next();
        System.out.print("삭제할 저자 명: ");
        String author = sc.next();
        Book removedBook = bc.deleteBook(title, author);
        if (removedBook != null) {
            System.out.println("성공적으로 삭제되었습니다.");
        } else {
            System.out.println("삭제할 도서를 찾지 못했습니다.");
        }
    }

    public void ascBook() {
        if (bc.ascBook() == 1) {
            System.out.println("정렬에 성공하였습니다.");
        } else {
            System.out.println("정렬에 실패하였습니다.");
        }
    }

    private String getCategory(int categoryNumber) {
        switch (categoryNumber) {
            case 1:
                return "인문";
            case 2:
                return "과학";
            case 3:
                return "외국어";
            case 4:
                return "기타";
            default:
                return "기타";
        }
    }
}

public class Run {
    public static void main(String[] args) {
        BookMenu menu = new BookMenu();
        menu.mainMenu();
    }
    
}
