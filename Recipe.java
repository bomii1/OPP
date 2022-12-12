package koFoods;

import java.io.IOException;

// 다형성(상속) -> 함수 recipe는 Search 클래스 타입의 매개 변수를 받기 때문에 Search 클래슬르 상속받은 Rice, Noodle 클래스도 매개변수로 사용될 수 있음
public class Recipe {
	public void recipe(Search obj, int Num) throws IOException, Exception { // 함수를 부른 곳으로 예외를 던져 예외처리
		obj.search(Num);
	}

}
