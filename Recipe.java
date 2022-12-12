package koFoods;

import java.io.IOException;

// 다형성(상속)
// Recipe 함수의 매개변수를 Search 클래스 타입으로 받음. Search 클래스를 상속 받은 Rice, Noodle 클래스를 대입하여 상속의 다형성을 구현
public class Recipe {
	public void recipe(Search obj, int Num) throws IOException, Exception { // 예외처리
		obj.search(Num);
	}

}
