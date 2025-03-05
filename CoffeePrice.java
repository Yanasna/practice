package practice;

import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("무슨 커피 드릴까요?");
		System.out.println("////////메뉴/////// ");
		System.out.println("에스프레소///카푸치노///카페라떼///아메리카노");
		String order = scanner.next();
		int price = 0 ;
		switch(order) { 
		case "에스프레소" :
		case "카푸치노" : 
		case "카페라떼" :
			price = 3500; break;
		case "아메리카노" : 
			price = 2000; break;
		default : System.out.println("메뉴에 없습니다 !!!");
		
		}
		System.out.println("얼음을 추가하시겠습니까?");
		String ice = scanner.next();
		
			if(ice.equals("네"))
				System.out.println(order + "에 얼음추가해서 " + (price + 300) + "원 입니다.");
			else
				System.out.print(order + "는 " + price + "원 입니다.");
		scanner.close();
		
	}	

}
