package practice;
		
import java.util.Scanner;

public class printst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원하는 층수를 입력하시오 >> ");
		Scanner floor = new Scanner(System.in);
		
		int fl = floor.nextInt();
		System.out.println("입력하신 층은 : " + fl);
		int star_count = 0;
		
		
		for(int i = 0; i < fl ; i++) {
			for(int j = fl; j > i ; j--) {
			System.out.print(" "); //공백은 별 하나 추가될수록 -	
			}
			System.out.print("*"); //일단 별하나 출력
			for(int count = star_count; count > 0; count--) {
				System.out.print("*");
					//층 1개당 별두개 출력해야함
			}
			star_count +=2;
			System.out.println(" ");
		}
	}

}
