package practice;

import java.util.Scanner;

public class EnumScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수 A : ");
		int a = stdIn.nextInt();
		System.out.println("정수 B : ");
		int b = stdIn.nextInt();
		if(a > b) {
			int t = a;
			a = b;
			b = t;
		}
		do {
			System.out.print(a + " ");
			a = a+1;
			
		}while (a <= b);
		System.out.println();
		
	}

}
