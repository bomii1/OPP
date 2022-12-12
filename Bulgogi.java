package koFoods;

public class Bulgogi implements MealKit {
	int num = 10;
	String name = "불고기";
	String[] ingredients = {"소고기", "양파", "당근", "간장", "설탕", "팽이버섯"};
	String spicyLevel = "X";
	String briefExplain = "얇게 썬 쇠고기를 양념장에 묻혀 구워 먹는 한국의 전통음식";
	
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
