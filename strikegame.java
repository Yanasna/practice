package practice;
	
import java.util.Scanner;
import java.util.Random;

public class strikegame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("|||||||||||STRIKE GAME START|||||||||");
		Scanner sc = new Scanner(System.in);		
		Random rd = new Random();
		
		int[] rdno = new int[3]; 
		
		for(int i = 0; i < 3; i++) {
			rdno[i] = rd.nextInt(9) + 1;
		}
		
		int[] su = new int[3];
		

		
		for(int i = 0; i < 9; i ++) {
			System.out.println();
			System.out.print("숫자를 입력하시오 : ");
			
			for(int j = 0; j < 3; j++) {
			su[j] = sc.nextInt();
			} //su 입력
			System.out.println();
			
			int count = 0;
			for(int k = 0; k < 3; k++) {//k와 l 값 일치 하지만 k = l이 되면 안됨.
				count = 0;
				
				if(rdno[k] == su[k]) {
					System.out.print("STRIKE  "); 
					} 
				for(int l = 0; l < 3; l++) {
					 //STRIKE 출력
					if((rdno[k] == su[l]) && (k != l)) {
						System.out.print("BALL  ");
						count += 1;
					}  //BALL 출력
				}
				if((rdno[k] != su[k]) && (count == 0))
				{
					System.out.print("OUT  ");
				}
			}
			System.out.println();
			//같지 않을시 out 출력
			
			if((rdno[0] == su[0]) && (rdno[1] == su[1]) && (rdno[2] == su[2])) {
				System.out.println("축하합니다!");
				System.out.println("플레이어의 승리!!!");
				
				break;
				}
			}
			
		
		}
	}
