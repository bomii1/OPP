package koFoods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

// Search 클래스를 상속받음
public class Rice extends Search {

	@Override
	// Search 클래스의 search 함수 재정의
	public void search(int foodNum) throws IOException, Exception { // 함수를 부른 곳으로 예외를 던져 예외처리
		super.search(foodNum); // 부모 클래스인 Search 클래스의 search 함수 사용
		
		// foodNum 이 1일때와 2일때로 나누어 다른 파일을 읽음
		if (foodNum == 1) {
			File file = new File("C://eclips//selfstudy//practice//01//src//koFoods//bokumbob.txt");
			Scanner sc = new Scanner(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			while (sc.hasNext()) {
				String str = sc.nextLine();
				System.out.println(str);
			}
		} else if (foodNum == 2) {
			File file = new File("C://eclips//selfstudy//practice//01//src//koFoods//bibimbob.txt");
			Scanner sc = new Scanner(new InputStreamReader(new FileInputStream(file), "UTF8"));
			while (sc.hasNext()) {
				String str = sc.nextLine();
				System.out.println(str);
			}
		} 
	}
}
