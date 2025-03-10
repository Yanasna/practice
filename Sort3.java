package practice;

import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		//scanner 받아서 수를 차례대로 정렬
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		System.out.println("정수 B : ");
		int b = stdIn.nextInt();
		System.out.println("정수 C : ");
		int c = stdIn.nextInt();
		
		if(a > b) {
			int t = a ; a= b; b = t; //int t에 a를 넣고 a에 b에 값을 받은다음 t에 a값 저장.
		}
		
		if(b > c) {
			int t = b; b = c; c = t;
		}
		
		if(c > a) {
			int t = c; c = a; a = t;
		}
		
		System.out.println("a <= b <= c가 되도록 정렬하였습니다.");
		System.out.println("변수 a는 " + a);
		System.out.println("변수 b는 " + b);
		System.out.println("변수 c는 " + c);
	}

}
