package koFoods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Rice extends Search {

	@Override
	public void search(int foodNum) throws IOException, Exception {
		super.search(foodNum);
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

