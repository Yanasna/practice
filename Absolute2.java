package practice;

import java.util.Scanner;

public class Absolute2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수값 : ");
		int n = stdIn.nextInt();
		int abs;
		
		if(n >= 0)
			abs = n;
		else
			abs = -n;
		System.out.println("절대값은 " + abs + "입니다.");
		
	}

}
