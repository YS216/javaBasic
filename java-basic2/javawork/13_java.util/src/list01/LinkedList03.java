package list01;

import java.util.LinkedList;

public class LinkedList03 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(3);		// 맨끝에 추가
		list.add(1, 5);		// index 1에 추가
		list.addFirst(1);	// 맨앞에 추가
		list.add(7);
		
		for(int i : list) {
			System.out.println(i);
			System.out.println("------");
			
			list.remove();	//맨 앞 노드 삭제
		}
		
		for (int i : list) {
			System.out.println(i);
		}

	}

}
