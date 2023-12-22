package inOut01;

import java.io.File;
import java.io.IOException;

public class File01 {
	// 간단한 파일 만들 때
	// java.io.File 클래스

	public static void main(String[] args) {
		
		try {
			
			File f1 = new File("test.txt");
			f1.createNewFile(); // 반드시 createNewFile()메소드를 호출해야 생성됨
			
			// File f2 = new File("C:\\test01.text");
			File f2 = new File("C:\\Users/test01.text");
			f2.createNewFile();
			
			// mkdir : 폴더생성 명령어
			File folderMk = new File("C:\\Users/temp");
			folderMk.mkdir();
			
			File f3 = new File("C:\\Users/temp/test-2.text");
			f3.createNewFile();
			
			System.out.println("test.txt 파일이 존재하는가? " + f1.exists());
			System.out.println("test03.txt 파일이 존재하는가? " + new File("test03.txt").exists());
			
			System.out.println("test.txt가 파일인가? " + f1.isFile());
			System.out.println("temp는 파일인가? " + folderMk.isFile());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
