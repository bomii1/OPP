package koFoods;

// 다형성(인터페이스) -> MealKit 인터페이스 타입의 매개변수를 받아 다형성을 구현함
public class Sale {
	public void sale(MealKit mealkit) {
		mealkit.explain();
	}
	

}
