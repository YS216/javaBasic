import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {
	
	private Scanner scanner = new Scanner(System.in);
	// private ToDo[] toDos = new ToDo[1000]; // 할 일을 저장, 관리하는 배열
	private int nextPosition = 1; // 다음 할 일을 등록할 때 사용할 자동 증가 값
	private ArrayList<ToDo> toDos; // = new ArrayList<>(); // 초기화는 생성자에서 처리
	
	public ToDoApp() { // 생성자 메서드 - ToOdApp 프로그렘 시작 위치로 해석 가능
		
		// 파일에 저장되어 있는 ToDo 리스트 데이터 읽어서 변수에 저장 
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("todos.dat");
			ois = new ObjectInputStream(fis);
			toDos = (ArrayList<ToDo>)ois.readObject();
			if (toDos.size() > 0) { // 읽어온 목록에 데이터라 1개 이상인 경우에만 다음 번호 조정
				ToDo lastToDo = toDos.get(toDos.size() - 1); // 마지막 할 일
				nextPosition = lastToDo.getNo() + 1; // 마지막 할 일 번호의 다음 번호를 다음에 생성할 ToDo의 번호로 저장
			}
		} catch (IOException | ClassNotFoundException ex) { // 두 종류의 예외를 한 곳에서 처리
			toDos = new ArrayList<>(); // 파일 읽기 실패하면 빈 ArrayList로 초기화
		} finally {
			try { ois.close(); } catch (Exception ex) {}
			try { fis.close(); } catch (Exception ex) {}
		}
		
	}
	
	/**
	 * 할 일 목록 관리 로직 구현 메서드
	 */
	public void doManage() { 
		
		outer : while (true) {
			String selection = selectTask();
			switch(selection) {
			case "1": 
				ToDo toDo = inputNewToDo(); 
				// 4. ToDo 인스턴스를 할 일 관리 배열에 추가
				toDo.setNo(nextPosition);
				// toDos[nextPosition] = toDo;
				toDos.add(toDo);
				nextPosition++; // 다음에 등록할 할 일 번호 변경
				break;
			case "2": 
				if (nextPosition == 0) {
					System.out.println("등록된 할 일이 없습니다.");
				} else {
					showAllToDos();
				}
				break;
			case "3":  // 검색
				// 검색어 입력
				System.out.print("검색어를 입력하세요 : ");
				String searchWord = scanner.nextLine();
				
				ArrayList<ToDo> searchedToDos = searchToDo(searchWord);
				
				if (searchedToDos.size() == 0) {
					System.out.println("검색 결과가 없습니다.");
					break;
				}
				showToDos(searchedToDos);
				break;
			case "4": break;
			case "5": break;
			case "6": // 저장
				saveToDos();
				break;
			case "9":
				System.out.println("할 일 관리 프로그렘을 종료합니다.");
				// saveToDos(); // 자동 저장 기능
				break outer;
			default :
				System.out.println("지원하지 않는 작업입니다.");
				break;
			}
		}
		
	}

	private void saveToDos() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("todo.dat"); // 저장
			oos = new ObjectOutputStream(fos);      // 객체 -> byte[] 변환
			oos.writeObject(toDos);;
			System.out.println("파일에 할 일 데이터를 저장했습니다.");
		} catch (IOException e) { // IOException은 FileNotFoundException의 부모 클래스
			e.printStackTrace();
		} finally {
			try { oos.close(); } catch (Exception ex) {}
			try { fos.close(); } catch (Exception ex) {} // do notthing - ignore exception
		}
	}

	private void showToDos(ArrayList<ToDo> searchedToDos) {
		System.out.println("[검색결과]");
		for (ToDo toDo2 : searchedToDos) {
			System.out.println(toDo2.info());
		}
	}

	private ArrayList<ToDo> searchToDo(String searchWord) {
		// 입력된 내용이 포함된 ToDo 찾기 (반복문)
		ArrayList<ToDo> searchedToDos = new ArrayList<>();
		// for (int i = 0; i < nextPosition; i++) {
		for (int i = 0; i < toDos.size(); i++) { // toDos.size() : 등록된 할 일 갯수
			String title = toDos.get(i).getTitle();
			if (title == searchWord) { // 문자열의 내용 비교는 equals 사용 ( 비교연산자 사용 X )
				if (title.contains(searchWord) ) { // contains(str) : str이 포함되어 있다면 true 아니면 false
					// 결과 표시	
					System.out.println(toDos.get(i).info());
				}
				
			}
		}
		return searchedToDos;
	}
	
	private void showAllToDos() {
		System.out.println("[전체 할 일 목록]");
		for (ToDo toDo : toDos) { // 처음부터 마지막 할 일이 등록되어 있는 위치까지 순회
			String info = toDo.info();
			System.out.println(info);
		}
	}
	
	private ToDo inputNewToDo() {
		// 1. ToDo 인스턴스 만들기
		ToDo toDo = new ToDo();
		// 2. 사용자 입력 
		System.out.print("할 일 제목 : ");
		String title = scanner.nextLine();
		System.out.print("할 일 내용 : ");
		String content = scanner.nextLine();
		java.util.Date now = new java.util.Date(); // new java.util.Date(); 현재 시간으로 Date 객체 초기화
		// 3. 입력 데이터를 toDo 인스턴스에 저장
		toDo.setTitle(title);
		toDo.setContent(content);
		// toDo.setRegDate(now);
		return toDo;
	}	
	
	private String selectTask() {
		System.out.println("**************************************");
		System.out.println("* 1. 할 일 등록                        *");
		System.out.println("* 2. 할 일 목록 보기                    *");
		System.out.println("* 3. 할 일 검색                        *");
		System.out.println("* 4. 할 일 수정                        *");
		System.out.println("* 5. 할 일 삭제                        *");
		System.out.println("* 6. 할 일 저장                        *");
		System.out.println("* 9. 종료                             *");
		System.out.println("**************************************");
		System.out.print("작업을 선택하세요 : ");
		String selection = scanner.nextLine();
		
		return selection;
	}

	
	public static void main(String[] args) {
		ToDoApp toDoApp = new ToDoApp();
		toDoApp.doManage();

	}

}
