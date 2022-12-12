package koFoods;

// MealKit 인터페이스 구현 클래스
public class Bulgogi implements MealKit {
	int num = 2; // 재고
	String name = "불고기"; // 밀키트 이름
	String[] ingredients = {"소고기", "양파", "당근", "간장", "설탕", "팽이버섯"}; // 밀키트에 들어가는 재료
	String spicyLevel = "X"; // 맵기
	String briefExplain = "얇게 썬 쇠고기를 양념장에 묻혀 구워 먹는 한국의 전통음식"; // 간단한 설명
	
	@Override
	// MealKit 인터페이스의 explain 추상함수 재정의
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
