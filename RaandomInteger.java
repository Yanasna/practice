package practice;
import java.util.Random;


public class RaandomInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand =new Random();
		
		int n1 = 1 + rand.nextInt(9);
		int n2 = -1 - rand.nextInt(9);
		int n3 = 10 + rand.nextInt(90);
		
		System.out.println("3개의 난수를 생성했습니다.");
		System.out.println("한 자리 양의 정수" + n1) ;
		System.out.println("한 자리 음의 정수" + n2);
		System.out.println("두 자리 양의 정수" + n3);
		
	}

}
