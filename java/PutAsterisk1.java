package practice;

import java.util.Scanner;

public class PutAsterisk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?");
		int n = stdIn.nextInt();
		if(n > 0) {
			int i = 0;
			while(i < n) {
				System.out.print('*');
				i++;
			}
			System.out.println();
		}
	}

}
