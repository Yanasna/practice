package practice;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner stdIn = new Scanner(System.in);		
		
		System.out.println("x와 y를 곱하고 나눕니다.");
		System.out.println("x의 값");
		int x = stdIn.nextInt();
		
		System.out.println("y의 값");
		int y = stdIn.nextInt();
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out .println(x % y);
		
		System.out.println("x의 부호를 반대로 한 값은 " + -x + "입니다.");
		System.out.println("x와 y의 평균은 " + (x*y)/2 + "입니다.");
		
		System.out.println("13 + 57 = " + 13 + 57);
		System.out.println("13 + 57 = " + (13 + 57));
		
		int a = 10;
		System.out.println("a = " + "a");
		System.out.println("a = " + a);
		
		System.out.println();
	}

}
