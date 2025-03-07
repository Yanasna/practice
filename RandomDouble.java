package practice;

import java.util.Random;

public class RandomDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		double x1 = rand.nextDouble();
		double x2 = 1 + rand.nextDouble(10);
		double x3 = -1 + 2 * rand.nextDouble();
		
		System.out.println("3개의 난수를 생성했습니다.");
		System.out.println("0.0이상 1.0 미만 : " + x1);
		System.out.println("0.0이상 10.0 미만 : " + x2);
		System.out.println("-1.0이상 1.0미만 : " + x3);
	}

}
