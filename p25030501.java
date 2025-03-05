package practice;

import java.util.Scanner;

public class p25030501 {
	public static void main(String[] args) {
		System.out.println("두 자리 수가 같은지 확인하는 프로그램");
		System.out.println("2자리 수 정수를 입력하세요(10 ~ 99) : ");
		Scanner su = new Scanner(System.in);
		int su1 = su.nextInt();
		
		if(su1%11 ==0) {
			System.out.println("Yes!!! 10의 자리와 1의 자리가 같습니다!");
		}
		else
			System.out.println("같지 않음 !");
		su.close();
	}
}
