package practice;

import java.util.Scanner;

public class p250305 {
	public static void main(String[] args) {
		System.out.println("원화를 입력하세요(단위 원) >>");
			
		Scanner won = new Scanner(System.in);
		int su = won.nextInt();
		double su2 = su / 1100; 
		
		System.out.println(su + "원은 $" + su2 + "입니다.");
		
		if(su%1100 != 0)
			System.out.println("나머지는 " + (su%1100) + "원 입니다.");
		
		won.close();
	}
}
