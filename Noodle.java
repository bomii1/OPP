package koFoods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

// 상속 사용 -> Search 클래스를 상속 받음
public class Noodle extends Search {
	
	// 부모클래스인 Search 의 search 함수를 재정의
	@Override
	public void search(int foodNum) throws IOException, Exception {
		super.search(foodNum); // 부모클래스의 search 함수 사용
		
		// foodNum 이 3일 경우에 파일을 읽음
		if (foodNum == 3) {
			File file = new File("C:\\Temp\\kalguksu.txt");
			Scanner sc = new Scanner(new InputStreamReader(new FileInputStream(file), "UTF8"));
			while (sc.hasNext()) {
				String str = sc.nextLine();
				System.out.println(str);
			}
		} 
	}
}
