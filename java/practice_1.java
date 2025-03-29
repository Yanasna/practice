package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int k =0;
			Scanner sc = new Scanner(System.in);
			int[] a = new int[4];
			for(int i : a)
			{
				System.out.println((i+1) + "번째 수 입력 : ");
				int p = sc.nextInt();
				a[i] = p;
				k = k + a[i];
			}
			System.out.println("모든 것의 합 : " + k);
	}
}
