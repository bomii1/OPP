package koFoods;

import java.io.IOException;

public class Recipe {
	// 다형성(상속)
// Recipe 함수의 매개변수를 Search 클래스 타입으로 받음. Search 클래스를 상속 받은 Rice, Noodle
	public void recipe(Search obj, int Num) throws IOException, Exception { // 예외처리
		obj.search(Num);
	}

}
