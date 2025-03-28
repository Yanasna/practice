package practice;

import java.util.Scanner;
import java.util.Random;

public class RandomRlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값 :  ");
		int x = stdIn.nextInt();
		
		System.out.println("입력 값의 +5와 -5범위의 난수를 생성했습니다.");
		System.out.println("값은 " + (x - 5 + rand.nextInt(11)) + "입니다.");
	}	

}
