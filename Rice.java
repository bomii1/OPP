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

	// Search 클래스의 search 함수를 재정의함
	@Override
	public void search(int foodNum) throws IOException, Exception {
		super.search(foodNum); // 부모클래스인 Search 클래스의 search 함수 사용

		// foodNum 이 1이냐 2이냐에 따라 다른 파일을 읽음
		if (foodNum == 1) {
			File file = new File("C:\\Temp\\bokumbob.txt");
			Scanner sc = new Scanner(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			while (sc.hasNext()) {
				String str = sc.nextLine();
				System.out.println(str);
			}
		} else if (foodNum == 2) {
			File file = new File("C:\\Temp\\bibimbob.txt");
			Scanner sc = new Scanner(new InputStreamReader(new FileInputStream(file), "UTF8"));
			while (sc.hasNext()) {
				String str = sc.nextLine();
				System.out.println(str);
			}
		} 
	}
}

