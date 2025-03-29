package practice;

import java.util.Scanner;

public class p25030502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("금액을 입력하시오>>");
		Scanner su = new Scanner(System.in);
		int won = su.nextInt();

		int remain = won;
		
		if(won / 50000 != 0) {
			System.out.println("오만원" + (won/50000) + "장");
			remain = remain %50000;
		} 
		
		if(remain / 10000 != 0) {
			System.out.println("만원" + (remain/10000) + "장");
			remain = remain % 10000;
		}
		
		if(remain / 5000 != 0) {
			System.out.println("오천원" + (remain/5000) + "장");
			remain = remain % 5000;
		}
		if(remain / 1000 != 0) {
			System.out.println("천원" + (remain/1000) + "장");
			remain = remain % 1000;
		}
		
		if(remain / 100 != 0) {
			System.out.println("백원" + (remain/100) + "개");
			remain = remain % 100;
		}
		if(remain / 50 != 0) {
			System.out.println("오십원" + (remain/50) + "개");
			remain = remain % 50;
		}
		
		if(remain / 10 != 0) {
			System.out.println("십원" + (remain/10) + "개");
			remain = remain % 10;
		}
		
		System.out.println("일원" + remain + "개");
		su.close();
	}

}
