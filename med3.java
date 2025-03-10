package practice;

import java.util.Scanner;

public class med3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 3개 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int middle = 0;
		
		if((c > a && a > b) || (b > a && a > c))
		{
			middle = a;
		}
		else if((c > b && b > a) || (a > b && b > c)) {
			middle = b;
		}
		else if((a > c && c > b) || (b > c && c > a)) {
			middle = c;
		}
		System.out.println("중앙 값은  : " + middle);
	}
}
