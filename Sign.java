package practice;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("정수 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		
		if(su < 0) {
			System.out.println("입력한 수는 음수입니다.");
		}
		else if(su == 0) {
			System.out.println("입력한 수는 0입니다.");
		}
		
		else {
			System.out.println("입력한 수는 양수입니다.");
		}
		
	}

}
