package practice;

import java.util.Scanner;

public class CountDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트다운 합니다");
		int x;
		do {
			System.out.println("양의 정수값 : ");
			x = stdIn.nextInt();
			
		}while(x <= 0);
		
		while(x >= 0) {
			System.out.println(x--);

		}
		System.out.println("x와 같이 " + x + "이 됐습니다.");
	}

}
