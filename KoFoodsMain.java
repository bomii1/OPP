package koFoods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class KoFoodsMain {
	// 예외처리, 파일을 읽으면서 생길 수 있는 예외를 던져 처리함
	public static void main(String[] args) throws IOException, Exception {
		boolean run = true; // while 문이 돌아갈지 말지를 결정하는 변수
		int orderNum; // 메뉴 변수
		int foodNum; // 레시피 변수
		int mealKitNum; // 밀키트 변수
		int ramyeonNum; // 라면 변수
		
		
		// 컬렉션 프레임워크 중 ArrayList 를 사용
		// 라면순위, add 함수를 사용하여 1위부터 10위까지의 라면을 ArrayList에 넣어줌
		List<String> ramyeon = new ArrayList<String>();
		ramyeon.add("농심 신라면 블랙");
		ramyeon.add("삼양 치즈 라면");
		ramyeon.add("팔도 치즈 라면");
		ramyeon.add("팔도 왕뚜껑 라면");
		ramyeon.add("농심 볶음 너구리");
		ramyeon.add("삼양 짜장 붉닭 라볶이");
		ramyeon.add("팔도 라볶이");
		ramyeon.add("삼양라면(매운맛)");
		ramyeon.add("오뚜기 진짬뽕");
		ramyeon.add("삼양 까르보나라 붉닭 라볶이");
		
		Scanner scan0 = new Scanner(System.in);
		
		System.out.println("어시오십시오 KoFoods 입니다! 원하시는 메뉴를 클릭해주세요!");
		while (run) { // run 이 true이면 계속 돌아가는 while문
			// 원하는 메뉴를 선택
			System.out.println("1. Find Reicipe |2. MealKit  |3. Ramyeon   |4. Quit");
			orderNum = scan0.nextInt();
			
			// 원하는 메뉴가 1번 Find Recipe 일 때 -> 세부 메뉴까지 선택 후 레시피를 확인할 수 있음, 없는 번호 선택시 에러문구 출력
			if (orderNum == 1) {
				System.out.println("원하시는 번호를 선택해주세요");
				System.out.println("1. 볶음밥  |2. 비빔밥  |3. 칼국수  ");
				
				// 다형성(상속) - 매개변수를 이용한 다형성 구현
				// Rice 와 Noodle 클래스는 Search 클래스를 상속 받은 자식 클래스로 부모타입인 Search 클래스로 자동 형변환이 가능함
				// Recipe 클래스에서 Search 클래스 타입의 매개변수를 갖는 함수를 만들고, 함수에 Rice 객체와 Noodle 객체를 넣어 레시피를 출력함
				Recipe recipe = new Recipe();
				Scanner scan1 = new Scanner(System.in);
				foodNum = scan1.nextInt();
				
				// 입력받은 foodNum 이 1이나 2일 때는 Rice 객체를 함수의 매개변수로 넣음
				if (foodNum == 1 || foodNum == 2) {
					recipe.recipe(new Rice(), foodNum);
				//  입력받은 foodNum 이 3일 때는 Noodle 객체를 함수의 매개변수로 넣음
				} else if (foodNum == 3) {
					recipe.recipe(new Noodle(), foodNum);
				// 1,2,3 이외의 번호는 잘못된 번호이므로 콘솔창에 에러 메세지를 출력함
				} else {
					System.out.println("원하시는 레시피를 찾을 수 없습니다");
				}
				System.out.println("");
				
			// 원하는 메뉴가 2번 MealKit 일 때 -> 김밥과 불고기 밀키트 중 골라서 설명을 볼 수 있음
			} else if (orderNum == 2) {
				// 다형성(인터페이스) - 매개변수를 이용한 다형성 구현
				// kimbob 클래스와 bulgogoi 클래스는 MealKit 인터페이스의 구현 객체
				// Sale 클래스에서 밀키트에 대해 설명해주는 함수를 만들고 매개변수를 MealKit 인터페이스 타입으로 받음
				Sale sale = new Sale();
				Kimbob kimbob = new Kimbob();
				Bulgogi bulgogi = new Bulgogi();
				System.out.println("원하는 밀키트 번호를 입력하면 간단한 설명을 볼 수 있습니다!");
				System.out.println("1. 김밥  |2. 불고기");
				Scanner scan3 = new Scanner(System.in);
				mealKitNum = scan3.nextInt();
				
				// 원하는 밀키트가 1번 김밥일 때
				if (mealKitNum == 1) {
					// kimbob 객체를 sale 함수의 매개변수로 넣음
					sale.sale(kimbob);
					
				// 원하는 밀키트가 2번 불고기일 때
				} else if (mealKitNum == 2) {
					// bulgogi 객체를 sale 함수의 매개변수로 넣음
					sale.sale(bulgogi);
				// 1, 2 이외의 번호는 잘못된 번호이므로 콘솔창에 에러 메세지 출력
				} else {
					System.out.println("원하시는 밀키트의 번호를 찾을 수 없습니다");				
				}
				System.out.println("");
			
			// 원하는 메뉴가 3번 Ramyeon 일 때 -> 현재 인기있는 라면 순위와 오늘의 라면을 랜덤으로 추천받을 수 있음 
			} else if (orderNum == 3){
				System.out.println("1. 라면 순위  | 2. 라면 추천");
				Scanner scan4 = new Scanner(System.in);
				ramyeonNum = scan4.nextInt();
				
				// 1번 라면 순위
				if (ramyeonNum == 1) {
					System.out.println("--------------------------");
					// 라면 순위는 ArrayList 를 사용하므로, for문을 돌려 리스트를 출력함
					for(int i=0; i<ramyeon.size(); i++) {
						System.out.println(i+1 + " " + ramyeon.get(i));
					}
					System.out.println("--------------------------");
					System.out.println("");
					
				// 2번 요일별 오늘의 라면 추천 -> 요일 + 추천라면을 출력해줌
				} else if (ramyeonNum == 2){
					System.out.println("무슨 라면을 살지 고민된다면 요일 별 라면 랜덤 추천 시스템을 이용해보세요!");
					Week today = null; // 오늘의 요일이 담길 열거 변수
					Calendar cal = Calendar.getInstance(); // 현재 날짜에 대한 정보를 얻기 위함
					int week = cal.get(Calendar.DAY_OF_WEEK); // 일(1) ~ 토(7)까지의 숫자를 리턴해줌
					int rand = (int)(Math.random() * 10); // 랜덤함수를 통해 1~10까지의 정수를 출력함
					
					// 스위치 문을 통해 얻은 1~7의 숫자를 케이스로 나누어 출력
					switch(week) {
						case 1:
							today = Week.SUNDAY;
							System.out.println("일요일의 추천라면은 " + ramyeon.get(rand) + "입니다!");
							break;
						case 2:
							today = Week.MONDAY;
							System.out.println("월요일의 추천라면은 " + ramyeon.get(rand) + "입니다!");
							break;
						case 3:
							today = Week.TUESDAY;
							System.out.println("화요일의 추천라면은 " + ramyeon.get(rand) + "입니다!");
							break;
						case 4:
							today = Week.WEDNESDAY;
							System.out.println("수요일의 추천라면은 " + ramyeon.get(rand) + "입니다!");
							break;
						case 5:
							today = Week.THURSDAY;
							System.out.println("목요일의 추천라면은 " + ramyeon.get(rand) + "입니다!");
							break;
						case 6:
							today = Week.FRIDAY;
							System.out.println("금요일의 추천라면은 " + ramyeon.get(rand) + "입니다!");
							break;
						case 7:
							today = Week.SATURDAY;
							System.out.println("토요일의 추천라면은 " + ramyeon.get(rand) + "입니다!");
							break;
					}
				// 1, 2 이외의 번호는 잘못된 번호이므로 콘솔창에 에러 메세지 출력
				} else {
					System.out.println("잘못된 번호입니다");
				}
				System.out.println("");
				
			// 4번을 입력하면 run 변수에 false를 넣어주면 다음 턴에서 while 문이 멈춘다
			} else {
				run = false;
			}
			
		}

	}

}
