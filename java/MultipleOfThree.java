package practice;

import java.util.Scanner;

class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		int number = scanner.nextInt();
		if(number % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다.");
		}
		scanner.close();
	}
	

}
