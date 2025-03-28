package practice;

import java.util.Scanner;
import java.util.Random;


public class FingerFlashing {

	public static void main(String[] args) {
		// TODO Auto-generated metho	d stub
		System.out.println("가위 바위 보 게임 시작!!!!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신이 낼 것 : ");
		String user = sc.nextLine();
		
		int whowin = 0;
		System.out.print("컴퓨터가 낸 것 : " );
		Random rd = new Random();
		switch(user) {
		case "가위" : 	
			whowin = 1;
			break;
		
		case "바위" : 
			whowin = 2;
			break;
		case "보" : 
			whowin = 3;
			break;
		}
		
		int rand = rd.nextInt(3) + 1;
		switch(rand) {
		case 1 : 
			System.out.println("가위");
			break;
		case 2 : 	
			System.out.println("바위");
			break;
		case 3 : 
			System.out.println("보");
			break;
		}
		if(whowin == rand) {
			System.out.println("!!!무승부!!!");
		}
		else if(whowin + 1 == rand) {
			System.out.println("플레이어가 패배했습니다!");
		}
		else if(whowin + 2 == rand) {
			System.out.println("플레이어가 승리했습니다!! winwin");
		}
		else if(whowin -1 == rand) {
			System.out.println("플레이어가 승리했습니다!! winwin");
		}
		else if(whowin - 2 == rand) {
			System.out.println("플레이어가 패배했습니다!");
		}
	}

}
