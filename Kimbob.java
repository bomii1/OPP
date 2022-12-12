package koFoods;

public class Kimbob implements MealKit {
	
	int num = 2; // 재고
	String name = "김밥"; // 밀키트 이름
	String[] ingredients = {"구운 김", "햇반", "햄", "게맛살", "계란지단", "우엉", "오이", "단무지", "김밥말이"}; // 밀키트에 들어가는 재료
	String spicyLevel = "X"; // 맵기
	String briefExplain = "구운 김에 밥과 각종 재료들 넣고 말아서 먹는 밥"; // 간단한 설명
	
	// MealKit 인터페이스의 구현 클래스이므로 explain 함수 재정의
	@Override
	public void explain() {
		System.out.println("이름: " + this.name);
		System.out.print("재료: ");
		for (String x:ingredients) {
			System.out.print(x + " ");
		}System.out.println();
		System.out.println("맵기: " + this.spicyLevel);
		System.out.println("간단한 설명: " + this.briefExplain);
		System.out.println("재고: " + this.num);
	}

}
